package co.topc.base.message.sms.service;

import co.topc.base.message.sms.entity.req.SendSmsReq;
import co.topc.base.message.sms.entity.req.ValidateSmsCodeReq;
import co.topc.base.message.sms.entity.resp.SendSmsResp;
import co.topc.exception.TopcSmsException;

/**
 * @author fantao
 * @date 2019/9/10 20:00
 */
public interface ISmsSendService {

    /**
     * 消息推送-实时推送
     *
     * @param sendSmsReq
     * @return
     */
    void sendSms(SendSmsReq sendSmsReq) throws TopcSmsException;

    /**
     * 短信验证码验证
     *
     * @param validateSmsCodeReq
     * @return
     */
    Boolean validateSmsCode(ValidateSmsCodeReq validateSmsCodeReq) throws TopcSmsException;

    /**
     * 多个消息推送
     *
     * @param sendSmsReq
     * @return
     */
    SendSmsResp sendBatchSms(SendSmsReq sendSmsReq);
}
