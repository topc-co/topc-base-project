package co.topc.base.message.mail.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * 发送一个HTML格式的邮件
 *
 * @author fantao
 * @date 2019/9/1 20:03
 */
@Component("htmlMailSender")
public class HtmlMailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${mail.fromMail.sender}")
    private String from;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void sendMail(String to, String subject, String content) {
        if (logger.isInfoEnabled()) {
            logger.info("简单格式邮件发送报文to:{},subject:{},content:{}", to, subject, content);
        }
        try {
            MimeMessage mimeMailMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);
            mimeMessageHelper.setFrom(from);
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(content, true);

            javaMailSender.send(mimeMailMessage);
        } catch (MessagingException e) {
            logger.error("发送HTML邮件失败", e);
        }
    }
}
