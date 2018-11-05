package com.chen.design.pattern.structural.proxy.staticproxy;

import com.chen.design.pattern.structural.proxy.Order;
import com.chen.design.pattern.structural.proxy.OrderService;
import com.chen.design.pattern.structural.proxy.OrderServiceImpl;
import com.chen.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 订单Service的静态代理类
 *
 * @Author LeifChen
 * @Date 2018-11-05
 */
public class OrderServiceStaticProxy {

    private static final String DB_PREFIX = "db";

    private OrderService orderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        System.out.println("静态代理：before method");
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");
        DataSourceContextHolder.setDBType(DB_PREFIX + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("静态代理：after method");
    }
}
