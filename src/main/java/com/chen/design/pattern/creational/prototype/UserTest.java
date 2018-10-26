package com.chen.design.pattern.creational.prototype;

import java.util.Arrays;
import java.util.Date;

/**
 * UserTest
 *
 * @Author LeifChen
 * @Date 2018-10-26
 */
public class UserTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birth = new Date();
        User user1 = new User("LeifChen", birth, Arrays.asList(new Date()));
        User user2 = (User) user1.clone();
        System.out.println(user1);
        System.out.println(user2);

        user1.getBirth().setTime(0L);
        user1.getUpdateTime().get(0).setTime(0L);
        System.out.println(user1);
        System.out.println(user2);
    }
}
