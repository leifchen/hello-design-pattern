package com.chen.design.pattern.creational.factory;

/**
 * Python视频
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class PythonVideo extends AbstractVideo {

    @Override
    public void produce() {
        System.out.println("录制Python视频课程");
    }
}
