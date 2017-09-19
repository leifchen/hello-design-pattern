package com.chen.facade;

/**
 * 外观模式：测试类
 *
 * @Author: LeifChen
 * @Date: 2017-09-19
 */
public class FacadeTest {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }

}
