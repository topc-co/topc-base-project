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
 * 发送带附件格式的邮件
 *
 * @author fantao
 * @date 2019/9/1 20:04
 */
@Component("attachmentMailSender")
public class AttachmentMailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${mail.fromMail.sender}")
    private String from;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void sendMail(String to, String subject, String content, String[] filePaths) {
        if (logger.isInfoEnabled()) {
            logger.info("发送带附件的邮件报文to:{},subject:{},content:{}", to, subject, content);
        }
        try {
            MimeMessage mimeMailMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);
            mimeMessageHelper.setFrom(from);
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(content, true);

            if (null != filePaths && filePaths.length > 0) {
                for (String filePath : filePaths) {
                    //文件路径
                    FileSystemResource file = new FileSystemResource(new File(filePath));
                    String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
                    mimeMessageHelper.addAttachment(fileName, file);
                }
            }

            javaMailSender.send(mimeMailMessage);
        } catch (MessagingException e) {
            logger.error("发送带附件的邮件失败", e);
        }
    }
}
