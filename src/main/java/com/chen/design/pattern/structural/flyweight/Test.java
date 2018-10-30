package com.chen.design.pattern.structural.flyweight;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public class Test {

    private static final String[] DEPARTMENTS = {"DEV", "PRD", "PM"};
    private static final int TEST_TIMES = 10;

    public static void main(String[] args) {
        for (int i = 0; i < TEST_TIMES; i++) {
            String department = DEPARTMENTS[(int) (Math.random() * DEPARTMENTS.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
