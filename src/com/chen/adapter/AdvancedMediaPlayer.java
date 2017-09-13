package com.chen.adapter;

/**
 * @Desc: 高级媒体播放器
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放VLC格式
     *
     * @param fileName 播放文件
     */
    void playVlc(String fileName);

    /**
     * 播放MP4格式
     *
     * @param fileName 播放文件
     */
    void playMp4(String fileName);

}
