package com.chen.builder;

/**
 * @Desc: 可口可乐
 * @Author: LeifChen
 * @Date: 2017-09-12
 */
public class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 6.0f;
    }

}
