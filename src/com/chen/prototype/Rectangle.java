package com.chen.prototype;

/**
 * @Desc: 矩形
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
