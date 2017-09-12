package com.chen.builder;

/**
 * @Desc: 冷饮
 * @Author: LeifChen
 * @Date: 2017-09-12
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
