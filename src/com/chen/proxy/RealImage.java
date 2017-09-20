package com.chen.proxy;

/**
 * RealImage 实现了 Image 接口
 *
 * @Author: LeifChen
 * @Date: 2017-09-20
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

}
