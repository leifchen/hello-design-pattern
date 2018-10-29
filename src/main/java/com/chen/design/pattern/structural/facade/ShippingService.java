package com.chen.design.pattern.structural.facade;

/**
 * 物流 Service
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "进入物流系统");
        return "1";
    }
}
