package co.topc.base.message.sms.service;

import co.topc.base.message.sms.entity.IemsSmsSendRecord;
import co.topc.base.message.sms.entity.req.SendSmsReq;

/**
 * @author fantao
 * @date 2019/9/15 18:46
 */
public interface IemsSmsSendRecordService {

    /**
     * 根据接收短信的手机号码查询短信发送记录
     *
     * @param phoneNumber 手机号码
     * @return
     */
    IemsSmsSendRecord findByPhoneNumber(String phoneNumber);

    /**
     * 新增短信发送记录
     *
     * @param sendSmsReq
     */
    void addIemsSmsSendRecord(SendSmsReq sendSmsReq);

    /**
     * 修改短信发送记录(将响应结果、响应时间回写)
     *
     * @param iemsSmsSendRecord
     */
    void updateIemsSmsSendRecord(IemsSmsSendRecord iemsSmsSendRecord);

    /**
     * 根据任务id更新发送记录
     *
     * @param outId        任务id
     * @param sendStatus   发送状态
     * @param responseTime 响应时间
     */
    void updateByOutId(String outId, String sendStatus, Long responseTime);
}
