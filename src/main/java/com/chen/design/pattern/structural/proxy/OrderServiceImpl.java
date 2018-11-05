package com.chen.design.pattern.structural.proxy;

/**
 * 订单Service的实现类
 *
 * @Author LeifChen
 * @Date 2018-11-05
 */
public class OrderServiceImpl implements OrderService {

    private OrderDAO orderDAO;

    @Override
    public int saveOrder(Order order) {
        orderDAO = new OrderDAOImpl();
        System.out.println("Service层调用DAO层保存Order成功");
        return orderDAO.insert(order);
    }
}
