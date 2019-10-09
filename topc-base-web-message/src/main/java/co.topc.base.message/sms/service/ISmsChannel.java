package co.topc.base.message.sms.service;

import co.topc.base.message.sms.entity.req.SendSmsReq;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.exceptions.ClientException;

/**
 * 消息渠道接口
 *
 * @author fantao
 * @date 2019/9/11 22:13
 */
public interface ISmsChannel {

    /**
     * 短信渠道消息实时推送
     *
     * @param sendSmsReq
     * @return
     */
    CommonResponse send(SendSmsReq sendSmsReq) throws ClientException;
}
