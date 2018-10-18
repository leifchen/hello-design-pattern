package com.chen.design.principle.interfacesegregation;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class Test {

    public static void main(String[] args) {
        BirdImpl bird = new BirdImpl();
        bird.eat();
        bird.fly();
    }
}
