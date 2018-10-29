package com.chen.design.pattern.structural.facade;

/**
 * Test
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("MacBook");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
