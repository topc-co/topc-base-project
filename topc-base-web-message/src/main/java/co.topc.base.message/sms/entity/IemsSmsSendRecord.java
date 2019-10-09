package co.topc.base.message.sms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_iems_sms_send_record
 * @author 
 */
public class IemsSmsSendRecord implements Serializable {
    /**
     * 主键ID
     */
    private String pkId;

    /**
     * 任务id
     */
    private String outId;

    /**
     * 签名名称
     */
    private String signName;

    /**
     * 模板code
     */
    private String templateCode;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 发送场景code
     */
    private String sendWhenCode;

    /**
     * 发送场景描述
     */
    private String sendWhenDesc;

    /**
     * 验证码
     */
    private String checkCode;

    /**
     * 接收短信的手机号码
     */
    private String phoneNumber;

    /**
     * 消息发送调用时间
     */
    private Long requestTime;

    /**
     * 消息发送响应时间
     */
    private Long responseTime;

    /**
     * 消息发送状态 0/发送失败 1/发送成功 2/调用成功 3/调用失败
     */
    private String sendStatus;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 是否删除 Y/N
     */
    private String isDeleted;

    private static final long serialVersionUID = 1L;

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }

    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        IemsSmsSendRecord other = (IemsSmsSendRecord) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getOutId() == null ? other.getOutId() == null : this.getOutId().equals(other.getOutId()))
            && (this.getSignName() == null ? other.getSignName() == null : this.getSignName().equals(other.getSignName()))
            && (this.getTemplateCode() == null ? other.getTemplateCode() == null : this.getTemplateCode().equals(other.getTemplateCode()))
            && (this.getTemplateName() == null ? other.getTemplateName() == null : this.getTemplateName().equals(other.getTemplateName()))
            && (this.getSendWhenCode() == null ? other.getSendWhenCode() == null : this.getSendWhenCode().equals(other.getSendWhenCode()))
            && (this.getSendWhenDesc() == null ? other.getSendWhenDesc() == null : this.getSendWhenDesc().equals(other.getSendWhenDesc()))
            && (this.getCheckCode() == null ? other.getCheckCode() == null : this.getCheckCode().equals(other.getCheckCode()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getRequestTime() == null ? other.getRequestTime() == null : this.getRequestTime().equals(other.getRequestTime()))
            && (this.getResponseTime() == null ? other.getResponseTime() == null : this.getResponseTime().equals(other.getResponseTime()))
            && (this.getSendStatus() == null ? other.getSendStatus() == null : this.getSendStatus().equals(other.getSendStatus()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkId() == null) ? 0 : getPkId().hashCode());
        result = prime * result + ((getOutId() == null) ? 0 : getOutId().hashCode());
        result = prime * result + ((getSignName() == null) ? 0 : getSignName().hashCode());
        result = prime * result + ((getTemplateCode() == null) ? 0 : getTemplateCode().hashCode());
        result = prime * result + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        result = prime * result + ((getSendWhenCode() == null) ? 0 : getSendWhenCode().hashCode());
        result = prime * result + ((getSendWhenDesc() == null) ? 0 : getSendWhenDesc().hashCode());
        result = prime * result + ((getCheckCode() == null) ? 0 : getCheckCode().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        result = prime * result + ((getResponseTime() == null) ? 0 : getResponseTime().hashCode());
        result = prime * result + ((getSendStatus() == null) ? 0 : getSendStatus().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkId=").append(pkId);
        sb.append(", outId=").append(outId);
        sb.append(", signName=").append(signName);
        sb.append(", templateCode=").append(templateCode);
        sb.append(", templateName=").append(templateName);
        sb.append(", sendWhenCode=").append(sendWhenCode);
        sb.append(", sendWhenDesc=").append(sendWhenDesc);
        sb.append(", checkCode=").append(checkCode);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", requestTime=").append(requestTime);
        sb.append(", responseTime=").append(responseTime);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}