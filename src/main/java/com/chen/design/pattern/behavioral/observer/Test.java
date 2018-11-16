package com.chen.design.pattern.behavioral.observer;

/**
 * 观察者模式测试类
 *
 * @Author LeifChen
 * @Date 2018-11-16
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("《Java设计模式》");
        Teacher teacher1 = new Teacher("Teacher111");
        Teacher teacher2 = new Teacher("Teacher222");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("LeifChen");
        question.setContent("观察者模式的原理是什么？");

        course.produceQuestion(course, question);
    }
}
