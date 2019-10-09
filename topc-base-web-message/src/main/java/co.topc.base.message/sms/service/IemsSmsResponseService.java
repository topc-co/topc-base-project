package co.topc.base.message.sms.service;

import com.aliyuncs.CommonResponse;

/**
 * @author fantao
 * @date 2019/9/15 23:09
 */
public interface IemsSmsResponseService {

    /**
     * 新增发送消息响应内容
     *
     * @param commonResponse
     */
    void addIemsSmsResponse(CommonResponse commonResponse);
}
