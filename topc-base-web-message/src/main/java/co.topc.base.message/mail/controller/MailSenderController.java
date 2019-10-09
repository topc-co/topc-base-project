package co.topc.base.message.mail.controller;

import co.topc.base.message.mail.service.IMailSender;
import co.topc.web.commons.TopcWebResponse;
import co.topc.web.commons.utils.TopcWebResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fantao
 * @date 2019/9/2 8:33
 */
@RestController
@RequestMapping("mail")
public class MailSenderController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IMailSender mailSender;

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public TopcWebResponse sendMail() {
//        mailSender.sendSimpleMail("1185766226@qq.com", "测试发送简单邮件",
//                "这是一封简单文本邮件！！！");

        String[] filePaths = new String[]{"C:\\Users\\11857\\Desktop\\MailUtil.java"};
        mailSender.sendAttachmentsMail("1185766226@qq.com", "测试发送带附件的邮件",
                "这是一封带附件的邮件！！！", filePaths);
        return TopcWebResponseUtil.getSuccess("");
    }
}
