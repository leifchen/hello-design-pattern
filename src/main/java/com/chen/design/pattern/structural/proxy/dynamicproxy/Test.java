package com.chen.design.pattern.structural.proxy.dynamicproxy;

import com.chen.design.pattern.structural.proxy.Order;
import com.chen.design.pattern.structural.proxy.OrderService;
import com.chen.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-11-05
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderService dynamicProxy = (OrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        dynamicProxy.saveOrder(order);
    }
}
