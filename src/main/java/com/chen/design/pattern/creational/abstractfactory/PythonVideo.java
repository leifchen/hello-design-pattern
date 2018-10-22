package com.chen.design.pattern.creational.abstractfactory;

/**
 * Python课程视频
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class PythonVideo extends AbstractVideo {

    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
