package com.chen.proxy;

/**
 * 代理模式：测试类
 *
 * @Author: LeifChen
 * @Date: 2017-09-20
 */
public class ProxyTest {

    public static void main(String[] args) {
        Image image = new ProxyImage("proxy.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像将无法从磁盘加载
        image.display();
    }

}
