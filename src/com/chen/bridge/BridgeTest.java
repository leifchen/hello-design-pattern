package com.chen.bridge;

/**
 * @Desc: 桥接模式：测试类
 * @Author: LeifChen
 * @Date: 2017-09-14
 */
public class BridgeTest {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
