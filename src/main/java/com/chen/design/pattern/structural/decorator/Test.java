package com.chen.design.pattern.structural.decorator;

/**
 * Test
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public class Test {

    public static void main(String[] args) {
        AbstractPancake pancake;
        pancake = new Pancake();
        pancake = new EggDecorator(pancake);
        pancake = new SausageDecorator(pancake);
        System.out.println(pancake.getDesc() + "，价格：" + pancake.getPrice());
    }
}
