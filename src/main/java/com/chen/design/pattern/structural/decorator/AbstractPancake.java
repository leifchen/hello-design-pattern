package com.chen.design.pattern.structural.decorator;

/**
 * 煎饼的抽象类
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public abstract class AbstractPancake {

    /**
     * 描述
     *
     * @return
     */
    public abstract String getDesc();

    /**
     * 价格
     *
     * @return
     */
    public abstract int getPrice();
}
