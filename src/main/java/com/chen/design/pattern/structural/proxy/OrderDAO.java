package com.chen.design.pattern.structural.proxy;

/**
 * 订单DAO接口
 *
 * @Author LeifChen
 * @Date 2018-11-05
 */
public interface OrderDAO {

    /**
     * 新增订单
     * @param order
     * @return
     */
    int insert(Order order);
}
