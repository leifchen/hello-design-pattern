package com.chen.proxy;

/**
 * 代理模式：代理类
 *
 * @Author: LeifChen
 * @Date: 2017-09-20
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (null == realImage) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
