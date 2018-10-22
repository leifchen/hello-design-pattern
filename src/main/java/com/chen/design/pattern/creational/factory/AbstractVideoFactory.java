package com.chen.design.pattern.creational.factory;

/**
 * 视频的工厂抽象类
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public abstract class AbstractVideoFactory {

    /**
     * 获取对应视频
     *
     * @return
     */
    public abstract AbstractVideo getVideo();
}
