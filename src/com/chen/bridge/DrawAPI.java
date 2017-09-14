package com.chen.bridge;

/**
 * @Desc: 桥接模式: 桥接实现接口
 * @Author: LeifChen
 * @Date: 2017-09-14
 */
public interface DrawAPI {

    /**
     * 绘制圆形
     * @param radius 半径
     * @param x
     * @param y
     */
    void drawCircle(int radius, int x, int y);

}
