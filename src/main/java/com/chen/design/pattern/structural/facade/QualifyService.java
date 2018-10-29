package com.chen.design.pattern.structural.facade;

/**
 * QualifyService
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验"+pointsGift.getName() + "积分资格通过");
        return true;
    }
}
