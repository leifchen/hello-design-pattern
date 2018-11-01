package com.chen.design.pattern.structural.bridge;

/**
 * 农业银行
 *
 * @Author LeifChen
 * @Date 2018-11-01
 */
public class ABCBank extends AbstractBank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account open() {
        System.out.println("打开农业银行");
        super.account.open();
        return super.account;
    }
}
