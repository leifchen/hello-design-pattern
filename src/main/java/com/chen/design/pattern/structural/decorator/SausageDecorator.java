package com.chen.design.pattern.structural.decorator;

/**
 * 加香肠
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "，加一根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
