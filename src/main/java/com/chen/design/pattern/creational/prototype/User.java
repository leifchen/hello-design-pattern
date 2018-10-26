package com.chen.design.pattern.creational.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户
 *
 * @Author LeifChen
 * @Date 2018-10-26
 */
@Getter
@Setter
public class User implements Cloneable {

    private String name;
    private Date birth;
    private List<Date> updateTime;

    public User(String name, Date birth, List<Date> updateTime) {
        this.name = name;
        this.birth = birth;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", updateTime=" + updateTime +
                '}' +
                super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅拷贝
        User user = (User) super.clone();
        // 深拷贝
        user.birth = (Date) user.birth.clone();
        user.updateTime = new ArrayList<>();
        updateTime.forEach((time) -> user.updateTime.add((Date) time.clone()));
        return user;
    }
}
