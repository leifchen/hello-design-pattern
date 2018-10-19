package com.chen.design.principle.liskovsubstitution;

/**
 * 手枪
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public class HandGun extends AbstractGun{

    @Override
    public void features() {
        System.out.println("手枪小，威力小");
    }

    @Override
    public void shoot() {
        System.out.println("使用手枪射击");
    }
}
