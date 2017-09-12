package com.chen.builder;

/**
 * @Desc: 百事可乐
 * @Author: LeifChen
 * @Date: 2017-09-12
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5.0f;
    }

}
