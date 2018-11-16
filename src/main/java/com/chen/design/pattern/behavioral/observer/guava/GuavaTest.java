package com.chen.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * Guava观察者模式测试类
 *
 * @Author LeifChen
 * @Date 2018-11-16
 */
public class GuavaTest {

    public static void main(String[] args) {
        Course course = new Course("《Java设计模式》");
        Teacher teacher1 = new Teacher("Teacher111");
        Teacher teacher2 = new Teacher("Teacher222");
        Question question = new Question();
        question.setUserName("LeifChen");
        question.setContent("观察者模式的原理是什么？");
        course.produceQuestion(course, question);

        EventBus eventBus = new EventBus();
        eventBus.register(teacher1);
        eventBus.register(teacher2);
        eventBus.post(question);
    }
}
