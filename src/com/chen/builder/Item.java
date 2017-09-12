package com.chen.builder;

/**
 * @Desc: 表示食物条目的接口
 * @Author: LeifChen
 * @Date: 2017-09-12
 */
public interface Item {

    public String name();
    public Packing packing();
    public float price();

}
