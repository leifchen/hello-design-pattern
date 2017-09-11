package com.chen.abstractfactory;

/**
 * Description: 抽象工厂模式 方形
 * Author: LeifChen
 * Date: 2017-09-11
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
