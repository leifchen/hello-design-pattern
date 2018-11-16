package com.chen.design.pattern.behavioral.observer;

import lombok.Getter;

import java.util.Observable;

/**
 * 课程
 *
 * @Author LeifChen
 * @Date 2018-11-16
 */
@Getter
public class Course extends Observable {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.name+"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
