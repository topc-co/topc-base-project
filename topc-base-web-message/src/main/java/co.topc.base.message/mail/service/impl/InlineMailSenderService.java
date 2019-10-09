package co.topc.base.message.mail.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * 发送带静态资源的邮件
 *
 * @author fantao
 * @date 2019/9/1 20:00
 */
@Component("inlineMailSender")
public class InlineMailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${mail.fromMail.sender}")
    private String from;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void sendMail(String to, String subject, String content, String rscPath, String rscId) {
        if (logger.isInfoEnabled()) {
            logger.info("发送带静态资源的邮件报文to:{},subject:{},content:{}", to, subject, content);
        }
        MimeMessage mimeMailMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);
            mimeMessageHelper.setFrom(from);
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(content, true);

            FileSystemResource res = new FileSystemResource(new File(rscPath));
            mimeMessageHelper.addInline(rscId, res);

            javaMailSender.send(mimeMailMessage);
        } catch (MessagingException e) {
            logger.error("发送带静态资源的邮件失败", e);
        }
    }
}
