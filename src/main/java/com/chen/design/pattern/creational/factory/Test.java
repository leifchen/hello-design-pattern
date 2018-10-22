package com.chen.design.pattern.creational.factory;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class Test {

    public static void main(String[] args) {
        AbstractVideoFactory videoFactory1 = new JavaVideoFactory();
        AbstractVideo video1 = videoFactory1.getVideo();
        video1.produce();

        AbstractVideoFactory videoFactory2 = new PythonVideoFactory();
        AbstractVideo video2 = videoFactory2.getVideo();
        video2.produce();
    }
}
