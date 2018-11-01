package com.chen.design.pattern.structural.bridge;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-11-01
 */
public class Test {

    public static void main(String[] args) {
        ICBCBank icbcBank1 = new ICBCBank(new DepositAccount());
        icbcBank1.open();
        icbcBank1.account.showType();

        ICBCBank icbcBank2 = new ICBCBank(new CurrentAccount());
        icbcBank2.open();
        icbcBank2.account.showType();

        ABCBank abcBank = new ABCBank(new CurrentAccount());
        abcBank.open();
        abcBank.account.showType();
    }
}
