package co.topc.base.message.mail.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_iems_mail_send_record
 * @author 
 */
public class IemsMailSendRecord implements Serializable {
    /**
     * 主键ID
     */
    private String pkId;

    /**
     * 发件人
     */
    private String mailSender;

    /**
     * 收件人
     */
    private String mailReceiver;

    /**
     * 抄送人
     */
    private String mailCopyTo;

    /**
     * 邮件主题
     */
    private String mailSubject;

    /**
     * 邮件类型 文本邮件/带附件邮件
     */
    private String mailType;

    /**
     * 邮件附件
     */
    private String mailAttachment;

    /**
     * 邮件发送状态 1/成功、0/失败
     */
    private String mailSendStatus;

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

    /**
     * 邮件内容
     */
    private String mailContent;

    private static final long serialVersionUID = 1L;

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getMailSender() {
        return mailSender;
    }

    public void setMailSender(String mailSender) {
        this.mailSender = mailSender;
    }

    public String getMailReceiver() {
        return mailReceiver;
    }

    public void setMailReceiver(String mailReceiver) {
        this.mailReceiver = mailReceiver;
    }

    public String getMailCopyTo() {
        return mailCopyTo;
    }

    public void setMailCopyTo(String mailCopyTo) {
        this.mailCopyTo = mailCopyTo;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailType() {
        return mailType;
    }

    public void setMailType(String mailType) {
        this.mailType = mailType;
    }

    public String getMailAttachment() {
        return mailAttachment;
    }

    public void setMailAttachment(String mailAttachment) {
        this.mailAttachment = mailAttachment;
    }

    public String getMailSendStatus() {
        return mailSendStatus;
    }

    public void setMailSendStatus(String mailSendStatus) {
        this.mailSendStatus = mailSendStatus;
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

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
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
        IemsMailSendRecord other = (IemsMailSendRecord) that;
        return (this.getPkId() == null ? other.getPkId() == null : this.getPkId().equals(other.getPkId()))
            && (this.getMailSender() == null ? other.getMailSender() == null : this.getMailSender().equals(other.getMailSender()))
            && (this.getMailReceiver() == null ? other.getMailReceiver() == null : this.getMailReceiver().equals(other.getMailReceiver()))
            && (this.getMailCopyTo() == null ? other.getMailCopyTo() == null : this.getMailCopyTo().equals(other.getMailCopyTo()))
            && (this.getMailSubject() == null ? other.getMailSubject() == null : this.getMailSubject().equals(other.getMailSubject()))
            && (this.getMailType() == null ? other.getMailType() == null : this.getMailType().equals(other.getMailType()))
            && (this.getMailAttachment() == null ? other.getMailAttachment() == null : this.getMailAttachment().equals(other.getMailAttachment()))
            && (this.getMailSendStatus() == null ? other.getMailSendStatus() == null : this.getMailSendStatus().equals(other.getMailSendStatus()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getMailContent() == null ? other.getMailContent() == null : this.getMailContent().equals(other.getMailContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkId() == null) ? 0 : getPkId().hashCode());
        result = prime * result + ((getMailSender() == null) ? 0 : getMailSender().hashCode());
        result = prime * result + ((getMailReceiver() == null) ? 0 : getMailReceiver().hashCode());
        result = prime * result + ((getMailCopyTo() == null) ? 0 : getMailCopyTo().hashCode());
        result = prime * result + ((getMailSubject() == null) ? 0 : getMailSubject().hashCode());
        result = prime * result + ((getMailType() == null) ? 0 : getMailType().hashCode());
        result = prime * result + ((getMailAttachment() == null) ? 0 : getMailAttachment().hashCode());
        result = prime * result + ((getMailSendStatus() == null) ? 0 : getMailSendStatus().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getMailContent() == null) ? 0 : getMailContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkId=").append(pkId);
        sb.append(", mailSender=").append(mailSender);
        sb.append(", mailReceiver=").append(mailReceiver);
        sb.append(", mailCopyTo=").append(mailCopyTo);
        sb.append(", mailSubject=").append(mailSubject);
        sb.append(", mailType=").append(mailType);
        sb.append(", mailAttachment=").append(mailAttachment);
        sb.append(", mailSendStatus=").append(mailSendStatus);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", mailContent=").append(mailContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}