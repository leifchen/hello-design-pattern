package com.chen.abstractfactory;

/**
 * Description: 抽象工厂模式 蓝色
 * Author: LeifChen
 * Date: 2017-09-11
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }

}
