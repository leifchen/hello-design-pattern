package com.chen.design.pattern.structural.flyweight;

import lombok.Setter;

/**
 * 经理
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public class Manager implements Employee {

    private String department;
    @Setter
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
