package com.chen.design.pattern.structural.proxy;

/**
 * 订单Service
 *
 * @Author LeifChen
 * @Date 2018-11-05
 */
public interface OrderService {

    /**
     * 保存订单
     * @param order
     * @return
     */
    int saveOrder(Order order);
}
