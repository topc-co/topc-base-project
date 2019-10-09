package co.topc.base.message.sms.entity.req;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author fantao
 * @date 2019/9/19 20:11
 */
public class ValidateSmsCodeReq implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 系统编码
     */
    @ApiModelProperty(value = "系统编码")
    public String systemCode;

    /**
     * 手机号码
     */
    @NotBlank(message = "手机号码不能为空")
    @ApiModelProperty(value = "手机号码", required = true)
    public String phoneNumber;

    /**
     * 短信验证码
     */
    @NotBlank(message = "短信验证码不能为空")
    @ApiModelProperty(value = "短信验证码", required = true)
    public String checkCode;

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
}
