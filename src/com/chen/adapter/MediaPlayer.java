package com.chen.adapter;

/**
 * @Desc: 媒体播放器接口
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public interface MediaPlayer {

    /**
     * 播放MP3格式
     * @param audioType
     * @param fileName
     */
    void play(String audioType, String fileName);

}
