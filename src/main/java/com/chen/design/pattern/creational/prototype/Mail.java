package com.chen.design.pattern.creational.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 邮件
 *
 * @Author LeifChen
 * @Date 2018-10-26
 */
@Getter
@Setter
@Data
public class Mail implements Cloneable {

    private String name;
    private String address;
    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
