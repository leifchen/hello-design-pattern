package com.chen.design.principle.interfacesegregation;

/**
 * 鸟
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class BirdImpl implements EatService, FlyService {

    @Override
    public void eat() {
        System.out.println("鸟在吃东西");
    }

    @Override
    public void fly() {
        System.out.println("鸟在飞行");
    }
}
