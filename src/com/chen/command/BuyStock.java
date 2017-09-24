package com.chen.command;

/**
 * BuyStock 实体类实现了 Order 接口
 *
 * @Author: LeifChen
 * @Date: 2017-09-24
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }

}
