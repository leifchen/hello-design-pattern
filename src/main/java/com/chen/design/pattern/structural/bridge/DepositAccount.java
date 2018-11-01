package com.chen.design.pattern.structural.bridge;

/**
 * 定期账户
 *
 * @Author LeifChen
 * @Date 2018-11-01
 */
public class DepositAccount implements Account {

    @Override
    public Account open() {
        System.out.println("打开定期账户");
        return new DepositAccount();
    }

    @Override
    public void showType() {
        System.out.println("账户类型：定期账户");
    }
}
