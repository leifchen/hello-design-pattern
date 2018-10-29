package com.chen.design.pattern.structural.facade;

/**
 * 积分支付 Service
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        System.out.println("支付" + pointsGift.getName() + "积分成功");
        return true;
    }
}
