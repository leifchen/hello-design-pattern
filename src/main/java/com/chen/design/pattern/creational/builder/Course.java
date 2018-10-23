package com.chen.design.pattern.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 课程
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
@Setter
@Getter
@ToString
public class Course {

    private String name;
    private String powerpoint;
    private String video;
    private String article;
    private String question;
}
