package co.topc.base.message.mail.service;

import co.topc.base.message.mail.service.impl.*;
import co.topc.web.commons.utils.TopcSpringContextUtil;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 对发送邮件接口进行空实现,具体实现由其子类完成
 *
 * @author fantao
 * @date 2019/9/1 19:49
 */
@Service
@Primary
public class MailSenderService implements IMailSender {

    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailSenderService simpleMailSender = TopcSpringContextUtil.getBean(SimpleMailSenderService.class);
        simpleMailSender.sendMail(to, subject, content);
    }

    @Override
    public void sendHtmlMail(String to, String subject, String content) {
        HtmlMailSenderService htmlMailSender = TopcSpringContextUtil.getBean(HtmlMailSenderService.class);
        htmlMailSender.sendMail(to, subject, content);
    }

    @Override
    public void sendAttachmentsMail(String to, String subject, String content, String[] filePaths) {
        AttachmentMailSenderService attachmentMailSender = TopcSpringContextUtil.getBean(AttachmentMailSenderService.class);
        attachmentMailSender.sendMail(to, subject, content, filePaths);
    }

    @Override
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId) {
        InlineMailSenderService inlineMailSender = TopcSpringContextUtil.getBean(InlineMailSenderService.class);
        inlineMailSender.sendMail(to, subject, content, rscPath, rscId);
    }

    @Override
    public void sendTemplateMail() {
        TemplateMailSenderService templateMailSender = TopcSpringContextUtil.getBean(TemplateMailSenderService.class);
        templateMailSender.sendMail();
    }
}
