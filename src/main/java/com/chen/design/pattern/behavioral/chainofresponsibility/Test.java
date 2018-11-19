package com.chen.design.pattern.behavioral.chainofresponsibility;

/**
 * 责任链模式：测试类
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class Test {

    public static void main(String[] args) {
        AbstractApprover articleApprover = new ArticleAbstractApprover();
        AbstractApprover videoApprover = new VideoAbstractApprover();

        Course course = new Course();
        course.setName("《Java设计模式》");
        course.setArticle("手记");
        // course.setVideo("视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
