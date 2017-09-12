package com.chen.builder;

/**
 * @Desc: 素食堡
 * @Author: LeifChen
 * @Date: 2017-09-12
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 16.0f;
    }

}
