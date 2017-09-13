package com.chen.adapter;

/**
 * @Desc: 适配器模式：媒体播放适配器
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * 适配器
     *
     * @param audioType
     */
    public MediaAdapter(String audioType) {
        if (("vlc").equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (("mp4").equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (("vlc").equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (("mp4").equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }

}
