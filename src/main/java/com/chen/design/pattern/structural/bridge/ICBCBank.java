package com.chen.design.pattern.structural.bridge;

/**
 * 工商银行
 *
 * @Author LeifChen
 * @Date 2018-11-01
 */
public class ICBCBank extends AbstractBank{

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account open() {
        System.out.println("打开工商银行");
        super.account.open();
        return super.account;
    }
}
