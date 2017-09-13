package com.chen.adapter;

/**
 * @Desc: MP3播放器
 * @Author: LeifChen
 * @Date: 2017-09-13
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // 播放mp3音乐文件的内置支持
        if (("mp3").equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // mediaAdapter提供了播放其他文件格式的支持
        else if (("vlc").equalsIgnoreCase(audioType) || ("mp4").equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported!");
        }
    }

}
