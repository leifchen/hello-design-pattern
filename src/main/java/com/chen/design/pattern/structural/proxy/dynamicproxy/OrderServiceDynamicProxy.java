package com.chen.design.pattern.structural.proxy.dynamicproxy;

import com.chen.design.pattern.structural.proxy.Order;
import com.chen.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 订单Service的动态代理类
 *
 * @Author LeifChen
 * @Date 2018-11-05
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private static final String DB_PREFIX = "db";

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj){
        System.out.println("动态代理：before method");
        int userId = 0;
        if(obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");
        DataSourceContextHolder.setDBType(DB_PREFIX + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("动态代理：after method");
    }
}
