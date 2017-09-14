package com.chen.bridge;

/**
 * @Desc: 红色圆形
 * @Author: LeifChen
 * @Date: 2017-09-14
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ color: red, radius: " + radius + ", x: " + x + ", y:" + y + "]");
    }

}
