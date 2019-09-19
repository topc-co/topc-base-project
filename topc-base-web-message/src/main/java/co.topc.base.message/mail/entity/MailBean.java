package co.topc.base.message.mail.entity;

import java.io.Serializable;

/**
 * 发送邮件-封装接受者信息
 *
 * @author fantao
 * @date 2019/8/24 16:44
 */
public class MailBean implements Serializable {

    /**
     * 邮件发送人
     */
    private String sender;
    /**
     * 邮件接收人
     */
    private String receiver;
    /**
     * 邮件主题
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String content;


    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
