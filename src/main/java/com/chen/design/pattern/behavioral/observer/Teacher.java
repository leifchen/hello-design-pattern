package com.chen.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 讲师
 *
 * @Author LeifChen
 * @Date 2018-11-16
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(name + "老师的" + course.getName()
                + "课程收到一个" + question.getUserName() + "提交的问题：" + question.getContent());
    }
}
