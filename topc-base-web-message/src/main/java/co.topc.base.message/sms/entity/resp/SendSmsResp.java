package co.topc.base.message.sms.entity.resp;

import java.io.Serializable;

/**
 * @author fantao
 * @date 2019/9/10 20:01
 */
public class SendSmsResp implements Serializable {

    /**
     * 状态码的描述
     */
    private String message;
    /**
     * 请求ID
     */
    private String requestId;
    /**
     * 发送回执ID
     */
    private String bizId;
    /**
     * 请求状态码
     */
    private String code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
