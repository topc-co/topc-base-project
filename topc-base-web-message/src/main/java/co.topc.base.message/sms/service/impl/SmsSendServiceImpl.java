package co.topc.base.message.sms.service.impl;

import co.topc.base.message.sms.entity.IemsSmsSendRecord;
import co.topc.base.message.sms.entity.IemsSmsTemplate;
import co.topc.base.message.sms.entity.req.SendSmsReq;
import co.topc.base.message.sms.entity.req.ValidateSmsCodeReq;
import co.topc.base.message.sms.entity.resp.SendSmsResp;
import co.topc.base.message.sms.service.*;
import co.topc.exception.TopcSmsException;
import co.topc.web.commons.utils.TopcRandomUtil;
import co.topc.web.commons.utils.TopcStringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.exceptions.ClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author fantao
 * @date 2019/9/10 20:07
 */
@Service
@Primary
public class SmsSendServiceImpl implements ISmsSendService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ISmsChannel smsChannel;

    @Autowired
    private IemsSmsTemplateService iemsSmsTemplateService;

    @Autowired
    private IemsSmsSendRecordService iemsSmsSendRecordService;

    @Autowired
    private IemsSmsResponseService iemsSmsResponseService;

    private static final Long THREE_MINUTES_MILLI = 3 * 60 * 1000L;

    @Override
    public void sendSms(SendSmsReq sendSmsReq) throws TopcSmsException {
        // 组织发送短信参数(6位数验证码,外部交易流水id)
        String checkCode = TopcRandomUtil.generate(TopcRandomUtil.S_NUMBER, 6);

        JSONObject params = new JSONObject();
        params.put("code", checkCode);
        sendSmsReq.setTemplateParam(JSON.toJSONString(params));
        sendSmsReq.setCheckCode(checkCode);

        // 校验发送短信参数
        checkSendSmsReq(sendSmsReq);

        // 防止重复发送消息(3分钟内禁止重复发送)
        IemsSmsSendRecord iemsSmsSendRecord = iemsSmsSendRecordService.findByPhoneNumber(sendSmsReq.getPhoneNumber());
        if (null != iemsSmsSendRecord) {
            Long requestTime = iemsSmsSendRecord.getRequestTime();
            if (System.currentTimeMillis() < (requestTime + THREE_MINUTES_MILLI)) {
                throw new TopcSmsException("消息已发送,请勿重复点击！");
            }
        }

        // 记录发送的内容,包括验证码、短信模板、发送时间等
        iemsSmsSendRecordService.addIemsSmsSendRecord(sendSmsReq);

        // 发送消息
        CommonResponse commonResponse;
        try {
            commonResponse = smsChannel.send(sendSmsReq);
            logger.info("发送消息响应成功...");
        } catch (ClientException e) {
            logger.error("异步发送短信消息异常", e);
            throw new TopcSmsException("异步发送短信消息异常");
        }

        // 记录发送消息返回的结果
        if (null != commonResponse) {
            iemsSmsResponseService.addIemsSmsResponse(commonResponse);
        }

        // 根据返回结果更新发送状态
//        List<String> outIdList = CommonResponseUtil.getOutId(commonResponse);
//        if (CommonResponseUtil.isSuccess(commonResponse)) {
//            for (String outId : outIdList) {
//                iemsSmsSendRecordService.updateByOutId(outId, TopcStringConstant.ONE, System.currentTimeMillis());
//            }
//        } else {
//            for (String outId : outIdList) {
//                iemsSmsSendRecordService.updateByOutId(outId, TopcStringConstant.ZERO, System.currentTimeMillis());
//            }
//        }

    }

    @Override
    public Boolean validateSmsCode(ValidateSmsCodeReq validateSmsCodeReq) throws TopcSmsException {
        // 根据手机号码查询短信发送记录
        IemsSmsSendRecord iemsSmsSendRecord = iemsSmsSendRecordService.findByPhoneNumber(validateSmsCodeReq.getPhoneNumber());
        if (null == iemsSmsSendRecord) {
            throw new TopcSmsException("验证码不正确");
        }
        if (!validateSmsCodeReq.getCheckCode().equals(iemsSmsSendRecord.getCheckCode())) {
            throw new TopcSmsException("验证码不正确");
        }
        Long requestTime = iemsSmsSendRecord.getRequestTime();
        if (requestTime + THREE_MINUTES_MILLI < System.currentTimeMillis()) {
            throw new TopcSmsException("验证码已过期");
        }

        return Boolean.TRUE;
    }

    @Override
    public SendSmsResp sendBatchSms(SendSmsReq sendSmsReq) {
        return null;
    }

    /**
     * 校验发送短信的参数
     *
     * @param sendSmsReq 参数封装
     * @throws TopcSmsException
     */
    private void checkSendSmsReq(SendSmsReq sendSmsReq) throws TopcSmsException {
        if (TopcStringUtils.isBlank(sendSmsReq.getPhoneNumber())) {
            throw new TopcSmsException("接收短信的手机号码不能为空！");
        }
        if (TopcStringUtils.isBlank(sendSmsReq.getTemplateCode())) {
            throw new TopcSmsException("短信模板ID不能为空！");
        }

        IemsSmsTemplate iemsSmsTemplate = iemsSmsTemplateService.findByTemplateCode(sendSmsReq.getTemplateCode());
        if (null == iemsSmsTemplate) {
            throw new TopcSmsException("未查询到对应的短信模板ID,请检查！");
        } else {
            sendSmsReq.setTemplateName(iemsSmsTemplate.getTemplateName());
            sendSmsReq.setSendWhenCode(iemsSmsTemplate.getSendWhenCode());
            sendSmsReq.setSendWhenDesc(iemsSmsTemplate.getTemplateName());
        }

//        if (TopcStringUtils.isBlank(sendSmsReq.getTemplateParam())) {
//            throw new TopcSmsException("发送短信参数不能为空！");
//        }
//        if (TopcStringUtils.isBlank(sendSmsReq.getOutId())) {
//            throw new TopcSmsException("外部流水不能为空！");
//        }
    }
}
