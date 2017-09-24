package com.chen.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式：命令调用类
 *
 * @Author: LeifChen
 * @Date: 2017-09-24
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
    
}
