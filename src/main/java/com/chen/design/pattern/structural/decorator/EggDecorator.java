package com.chen.design.pattern.structural.decorator;

/**
 * 加蛋
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "，加一颗蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
