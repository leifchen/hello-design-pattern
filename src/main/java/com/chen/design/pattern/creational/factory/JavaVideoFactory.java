package com.chen.design.pattern.creational.factory;

/**
 * Java视频
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class JavaVideoFactory extends AbstractVideoFactory {

    @Override
    public AbstractVideo getVideo() {
        return new JavaVideo();
    }
}
