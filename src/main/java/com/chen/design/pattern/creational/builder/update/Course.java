package com.chen.design.pattern.creational.builder.update;

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

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.powerpoint = courseBuilder.powerpoint;
        this.video = courseBuilder.video;
        this.article = courseBuilder.article;
        this.question = courseBuilder.question;
    }

    public static class CourseBuilder {

        private String name;
        private String powerpoint;
        private String video;
        private String article;
        private String question;

        public CourseBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder buildPowerpoint(String powerpoint) {
            this.powerpoint = powerpoint;
            return this;
        }

        public CourseBuilder buildVideo(String video) {
            this.video = video;
            return this;
        }

        public CourseBuilder buildArticle(String article) {
            this.article = article;
            return this;
        }

        public CourseBuilder buildQuestion(String question) {
            this.question = question;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
