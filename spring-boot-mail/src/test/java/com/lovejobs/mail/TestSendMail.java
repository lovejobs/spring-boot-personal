package com.lovejobs.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MailApplication.class)
public class TestSendMail {


    @Autowired
    private JavaMailSender mailSender;


    @Test
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("fengxin@ushareit.com");
        message.setTo("love_jobs@sina.cn");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");

        mailSender.send(message);
    }


    @Test
    public void sendAttachmentsMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setFrom("fengxin@ushareit.com");
        helper.setTo("love_jobs@sina.cn");
        helper.setSubject("主题：简单邮件");
        helper.setText("测试邮件附件内容");
        FileSystemResource file = new FileSystemResource(new File(this.getClass().getResource("/").getPath().concat("/test.xlsx")));
        helper.addAttachment("fengxindefujian.xlsx",file);

        mailSender.send(mimeMessage);
    }

}
