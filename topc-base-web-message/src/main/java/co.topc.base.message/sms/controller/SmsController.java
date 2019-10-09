package co.topc.base.message.sms.controller;

import co.topc.base.message.sms.entity.req.SendSmsReq;
import co.topc.base.message.sms.entity.req.ValidateSmsCodeReq;
import co.topc.base.message.sms.service.ISmsSendService;
import co.topc.exception.TopcSmsException;
import co.topc.web.commons.TopcWebResponse;
import co.topc.web.commons.constants.TopcWebResponseEnum;
import co.topc.web.commons.utils.TopcWebResponseUtil;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fantao
 * @date 2019/9/16 12:23
 */
@RestController
@RequestMapping("sms")
@Api("短信相关api")
public class SmsController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ISmsSendService smsSendService;

    @ApiOperation("发送短信验证码")
    @ResponseBody
    @RequestMapping(value = "/sendSms", method = RequestMethod.POST)
    public TopcWebResponse sendSms(@RequestBody SendSmsReq sendSmsReq) {
        logger.info("发送短信，报文请求内容：{}", JSON.toJSONString(sendSmsReq));
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        try {
            smsSendService.sendSms(sendSmsReq);
            topcWebResponse.setData(sendSmsReq);
        } catch (TopcSmsException e) {
            logger.error("发送短信失败", e);
            topcWebResponse.setCode(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode());
            topcWebResponse.setMessage(e.getMessage());
        }
        return topcWebResponse;
    }

    @ApiOperation("短信验证码验证")
    @RequestMapping(value = "/validateSmsCode", method = RequestMethod.POST)
    @ResponseBody
    public TopcWebResponse validateSmsCode(@RequestBody ValidateSmsCodeReq validateSmsCodeReq) {
        logger.info("短信验证码验证，报文请求内容：{}", JSON.toJSONString(validateSmsCodeReq));
        TopcWebResponse topcWebResponse = TopcWebResponseUtil.getSuccess();
        try {
            Boolean result = smsSendService.validateSmsCode(validateSmsCodeReq);
            topcWebResponse.setData(result);
        } catch (TopcSmsException e) {
            logger.error("短信验证码验证失败", e);
            topcWebResponse.setCode(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode());
            topcWebResponse.setMessage(e.getMessage());
        }
        return topcWebResponse;
    }
}
