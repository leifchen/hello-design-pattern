package com.chen.decorator;

/**
 * 矩形 实现Shape接口
 *
 * @Author: LeifChen
 * @Date: 2017-09-18
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

}
