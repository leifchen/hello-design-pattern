package com.chen.command;

/**
 * 命令模式：测试类
 *
 * @Author: LeifChen
 * @Date: 2017-09-24
 */
public class CommandTest {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
