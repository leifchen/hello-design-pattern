package com.chen.design.pattern.creational.abstractfactory;

/**
 * Java课程手记
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class JavaArticle extends AbstractArticle {

    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
