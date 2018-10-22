package com.chen.design.pattern.creational.abstractfactory;

/**
 * Python课程手记
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class PythonArticle extends AbstractArticle {

    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
