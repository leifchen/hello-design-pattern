package com.chen.command;

/**
 * SellStock 实体类实现了 Order 接口
 *
 * @Author: LeifChen
 * @Date: 2017-09-24
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }

}
