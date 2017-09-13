package com.chen.prototype;

/**
 * @Desc: 方形
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
