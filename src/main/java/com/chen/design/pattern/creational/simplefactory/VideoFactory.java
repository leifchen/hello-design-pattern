package com.chen.design.pattern.creational.simplefactory;

/**
 * 视频的简单工厂类
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class VideoFactory {

    private static final String JAVA = "JAVA";
    private static final String PYTHON = "PYTHON";

    /**
     * 使用反射获取对应视频
     *
     * @param c
     * @return
     */
    public AbstractVideo getVideo(Class c) {
        AbstractVideo video = null;
        try {
            video = (AbstractVideo) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return video;
    }

    /**
     * 简单逻辑判断获取对应视频
     *
     * @param type
     * @return
     */
    public AbstractVideo getVideo(String type) {
        if (JAVA.equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if (PYTHON.equalsIgnoreCase(type)) {
            return new PythonVideo();
        } else {
            return null;
        }
    }
}
