package com.chen.filter;

/**
 * @Desc: 人员信息
 * @Author: LeifChen
 * @Date: 2017-09-15
 */
public class Person {

    private String name;

    private String gender;

    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

}
