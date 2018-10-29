package com.chen.design.pattern.structural.decorator;

/**
 * 煎饼
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public class Pancake extends AbstractPancake {

    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
