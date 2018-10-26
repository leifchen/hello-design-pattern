package com.chen.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * 邮件工具类
 *
 * @Author LeifChen
 * @Date 2018-10-26
 */
public class MailUtil {

    public static void sendMail(Mail mail) {
        String outputContent = "向收件人：{0}，地址：{1}，内容：{2}发送邮件";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getAddress(), mail.getContent()));
    }

    public static void saveMailContentTemplate(Mail mail) {
        System.out.println("保存邮件内容模板：" + mail.getContent());
    }
}
