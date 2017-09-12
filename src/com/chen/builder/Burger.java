package com.chen.builder;

/**
 * @Desc: 汉堡
 * @Author: LeifChen
 * @Date: 2017-09-12
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
