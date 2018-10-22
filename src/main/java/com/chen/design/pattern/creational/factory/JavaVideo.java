package com.chen.design.pattern.creational.factory;

/**
 * Java视频
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class JavaVideo extends AbstractVideo {

    @Override
    public void produce() {
        System.out.println("录制Java视频课程");
    }
}
