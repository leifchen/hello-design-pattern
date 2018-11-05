package com.chen.design.pattern.structural.proxy;

/**
 * 订单DAO接口的实现类
 *
 * @Author LeifChen
 * @Date 2018-11-05
 */
public class OrderDAOImpl implements OrderDAO{

    @Override
    public int insert(Order order) {
        System.out.println("DAO层新增Order成功");
        return 1;
    }
}
