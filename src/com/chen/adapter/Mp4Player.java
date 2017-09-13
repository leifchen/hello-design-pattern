package com.chen.adapter;

/**
 * @Desc: MP4播放器
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}
