package com.chen.abstractfactory;

/**
 * Description: 抽象工厂模式 绿色
 * Author: LeifChen
 * Date: 2017-09-11
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }

}
