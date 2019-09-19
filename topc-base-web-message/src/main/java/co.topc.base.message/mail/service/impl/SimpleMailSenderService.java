package co.topc.base.message.mail.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * 发送一个简单格式的邮件
 *
 * @author fantao
 * @date 2019/9/1 20:03
 */
@Component("simpleMailSender")
public class SimpleMailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${mail.fromMail.sender}")
    private String from;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void sendMail(String to, String subject, String content) {
        if (logger.isInfoEnabled()) {
            logger.info("简单格式邮件发送报文to:{},subject:{},content:{}", to, subject, content);
        }
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //邮件发送人
        simpleMailMessage.setFrom(from);
        //邮件接收人
        simpleMailMessage.setTo(to);
        //邮件主题
        simpleMailMessage.setSubject(subject);
        //邮件内容
        simpleMailMessage.setText(content);

        try {
            javaMailSender.send(simpleMailMessage);
        } catch (MailException e) {
            logger.error("简单格式邮件发送失败", e);
        }
    }
}
