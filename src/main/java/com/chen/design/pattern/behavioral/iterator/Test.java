package com.chen.design.pattern.behavioral.iterator;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-11-12
 */
public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("Java权限管理");
        Course course2 = new Course("Java设计模式");
        Course course3 = new Course("Python爬虫");

        CourseCollection courseCollection = new CourseCollectionImpl();
        courseCollection.addCourse(course1);
        courseCollection.addCourse(course2);
        courseCollection.addCourse(course3);

        System.out.println("-----课程列表-----");
        printCourses(courseCollection);

        courseCollection.removeCourse(course1);
        courseCollection.removeCourse(course3);

        System.out.println("-----删除操作之后的课程列表-----");
        printCourses(courseCollection);
    }

    /**
     * 打印课程列表
     *
     * @param courseCollection
     */
    private static void printCourses(CourseCollection courseCollection) {
        CourseIterator courseIterator = courseCollection.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
