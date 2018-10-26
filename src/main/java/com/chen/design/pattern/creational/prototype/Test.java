package com.chen.design.pattern.creational.prototype;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-26
 */
public class Test {

    private static final Integer COUNT = 3;

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("原始mail：" + mail);
        for (int i = 0; i < COUNT; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setAddress("姓名" + i + "@test.com");
            mailTemp.setContent("Hello Prototype");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆mail：" + mailTemp);
        }
        MailUtil.saveMailContentTemplate(mail);
    }
}
