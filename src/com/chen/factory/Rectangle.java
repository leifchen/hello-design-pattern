package com.chen.factory;

/**
 * Description: 工厂模式 矩形
 * Author: LeifChen
 * Date: 2017-09-11
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
