package co.topc.base.message.sms.entity.req;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 阿里云信息推送请求
 *
 * @author fantao
 * @date 2019/9/10 19:47
 */
public class SendSmsReq implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 接收短信的手机号码
     * 格式：
     * 国内短信：11位手机号码，例如15951955195。
     * 国际/港澳台消息：国际区号+号码，例如85200000000
     */
    @ApiModelProperty(value = "接收短信的手机号码", required = true)
    @NotBlank(message = "接收短信的手机号码不能为空")
    private String phoneNumber;

    /**
     * 短信签名名称
     */
    @ApiModelProperty(value = "短信签名名称", required = true)
    @NotBlank(message = "短信签名名称不能为空")
    private String signName;

    /**
     * 短信模板ID
     */
    @ApiModelProperty(value = "短信模板ID", required = true)
    @NotBlank(message = "短信模板ID不能为空")
    private String templateCode;

    /**
     * 短信模板名称
     */
    @ApiModelProperty(value = "短信模板名称")
    private String templateName;

    /**
     * 发送场景code
     */
    @ApiModelProperty(value = "发送场景code")
    private String sendWhenCode;

    /**
     * 发送场景描述
     */
    @ApiModelProperty(value = "发送场景描述")
    private String sendWhenDesc;

    /**
     * 验证码
     */
    @ApiModelProperty(value = "验证码")
    private String checkCode;

    /**
     * 外部流水扩展字段
     */
    @ApiModelProperty(value = "外部流水扩展字段")
    private String outId;

    /**
     * 上行短信扩展码，无特殊需要此字段的用户请忽略此字段
     */
    @ApiModelProperty(value = "上行短信扩展码")
    private String smsUpExtendCode;

    /**
     * 短信模板变量对应的实际值，JSON格式
     */
    @ApiModelProperty(value = "短信模板变量对应的实际值，JSON格式")
    private String templateParam;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public String getSmsUpExtendCode() {
        return smsUpExtendCode;
    }

    public void setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
    }

    public String getTemplateParam() {
        return templateParam;
    }

    public void setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
    }

    public String getSendWhenCode() {
        return sendWhenCode;
    }

    public void setSendWhenCode(String sendWhenCode) {
        this.sendWhenCode = sendWhenCode;
    }

    public String getSendWhenDesc() {
        return sendWhenDesc;
    }

    public void setSendWhenDesc(String sendWhenDesc) {
        this.sendWhenDesc = sendWhenDesc;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
}
