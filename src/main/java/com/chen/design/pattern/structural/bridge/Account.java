package com.chen.design.pattern.structural.bridge;

/**
 * 账户
 *
 * @Author LeifChen
 * @Date 2018-11-01
 */
public interface Account {

    /**
     * 打开账户
     *
     * @return
     */
    Account open();

    /**
     * 显示账户类型
     */
    void showType();
}
