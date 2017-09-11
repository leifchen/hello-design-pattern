package com.chen.factory;

/**
 * Description: 工厂模式：圆形
 * Author: LeifChen
 * Date: 2017-09-11
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
