package com.chen.design.pattern.structural.bridge;

/**
 * 活期账户
 *
 * @Author LeifChen
 * @Date 2018-11-01
 */
public class CurrentAccount implements Account {

    @Override
    public Account open() {
        System.out.println("打开活期账户");
        return new CurrentAccount();
    }

    @Override
    public void showType() {
        System.out.println("账户类型：活期账户");
    }
}
