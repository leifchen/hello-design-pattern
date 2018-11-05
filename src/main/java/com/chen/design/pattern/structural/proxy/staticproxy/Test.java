package com.chen.design.pattern.structural.proxy.staticproxy;

import com.chen.design.pattern.structural.proxy.Order;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-11-05
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy staticProxy = new OrderServiceStaticProxy();
        staticProxy.saveOrder(order);
    }
}
