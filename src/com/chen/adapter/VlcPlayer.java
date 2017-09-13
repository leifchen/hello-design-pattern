package com.chen.adapter;

/**
 * @Desc: VLC播放器
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }

}
