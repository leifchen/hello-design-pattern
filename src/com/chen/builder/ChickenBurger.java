package com.chen.builder;

/**
 * @Desc: 鸡肉堡
 * @Author: LeifChen
 * @Date: 2017-09-12
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 20.0f;
    }

}
