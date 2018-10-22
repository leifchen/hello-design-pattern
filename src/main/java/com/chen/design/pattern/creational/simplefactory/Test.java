package com.chen.design.pattern.creational.simplefactory;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        AbstractVideo video1 = videoFactory.getVideo("python");
        if (video1 != null) {
            video1.produce();
        }

        AbstractVideo video2 = videoFactory.getVideo(JavaVideo.class);
        if (video2 != null) {
            video2.produce();
        }
    }
}
