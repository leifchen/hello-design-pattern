package com.chen.design.principle.liskovsubstitution;

/**
 * 步枪
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public class RifleGun extends AbstractGun {

    @Override
    public void features() {
        System.out.println("步枪长，威力大");
    }

    @Override
    public void shoot() {
        System.out.println("使用步枪射击");
    }
}
