package com.chen.prototype;

/**
 * @Desc: 圆形
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
