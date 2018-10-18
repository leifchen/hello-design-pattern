package com.chen.design.principle.singleresponsibility;

/**
 * UserServiceImpl
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class UserServiceImpl implements UserPropertyService, UserActionService {

    @Override
    public void saveUser() {
        System.out.println("保存用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }

    @Override
    public void updateName(String name) {
        System.out.println("更新用户名称");
    }

    @Override
    public void updatePassword(String password) {
        System.out.println("更新用户密码");
    }
}
