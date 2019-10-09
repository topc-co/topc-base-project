package co.topc.base.message.mail.service;

/**
 * 定义发送邮件的方法
 *
 * @author fantao
 * @date 2019/9/1 23:21
 */
public interface IMailSender {

    /**
     * 发送简单文本邮件
     *
     * @param to      收件人
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    void sendSimpleMail(String to, String subject, String content);

    /**
     * 发送 html 格式邮件
     *
     * @param to      收件人
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    void sendHtmlMail(String to, String subject, String content);

    /**
     * 发送带附件的邮件
     *
     * @param to        收件人
     * @param subject   邮件主题
     * @param content   邮件内容
     * @param filePaths 附件路径,支持多个附件
     */
    void sendAttachmentsMail(String to, String subject, String content, String[] filePaths);

    /**
     * 发送带静态资源的邮件
     *
     * @param to      收件人
     * @param subject 邮件主题
     * @param content 邮件内容
     * @param rscPath 静态资源路径
     * @param rscId
     */
    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);

    /**
     * 发送邮件模板邮件
     */
    void sendTemplateMail();
}
