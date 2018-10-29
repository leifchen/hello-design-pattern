package com.chen.design.pattern.structural.decorator;

/**
 * 装饰的抽象类
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public class AbstractDecorator extends AbstractPancake {

    private AbstractPancake abstractPancake;

    public AbstractDecorator(AbstractPancake abstractPancake) {
        this.abstractPancake = abstractPancake;
    }

    @Override
    public String getDesc() {
        return abstractPancake.getDesc();
    }

    @Override
    public int getPrice() {
        return abstractPancake.getPrice();
    }
}
