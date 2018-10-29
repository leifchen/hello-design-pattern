package com.chen.design.pattern.structural.facade;

import lombok.Getter;
import lombok.Setter;

/**
 * 积分礼品
 *
 * @Author LeifChen
 * @Date 2018-10-29
 */
@Getter
@Setter
public class PointsGift {

    private String name;

    public PointsGift(String name) {
        this.name = name;
    }
}
