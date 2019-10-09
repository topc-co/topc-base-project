package co.topc.base.message.mail.service.impl;

import co.topc.base.message.mail.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author fantao
 * @date 2019/9/1 20:15
 */
@Component("templateMailSender")
public class TemplateMailSenderService {

    @Autowired
    private MailSenderService mailSender;

    @Autowired
    private TemplateEngine templateEngine;

    public void sendMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "006");
        String emailContent = templateEngine.process("emailTemplate", context);

        mailSender.sendHtmlMail("ityouknow@126.com", "主题：这是模板邮件", emailContent);
    }
}
