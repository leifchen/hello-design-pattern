package com.chen.design.principle.singleresponsibility;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class Test {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.updateName("LeifChen");
        userService.updatePassword("123456");

        userService.saveUser();
        userService.deleteUser();
    }
}
