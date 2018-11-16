package com.chen.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 讲师
 *
 * @Author LeifChen
 * @Date 2018-11-16
 */
public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question) {
        System.out.println(name + "老师的"
                + "课程收到一个" + question.getUserName() + "提交的问题：" + question.getContent());
    }
}
