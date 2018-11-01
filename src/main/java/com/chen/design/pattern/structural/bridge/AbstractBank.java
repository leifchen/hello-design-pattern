package com.chen.design.pattern.structural.bridge;

/**
 * 银行
 *
 * @Author LeifChen
 * @Date 2018-11-01
 */
public abstract class AbstractBank {

    protected Account account;

    public AbstractBank(Account account) {
        this.account = account;
    }

    /**
     * 打开账户
     *
     * @return
     */
    abstract Account open();
}
