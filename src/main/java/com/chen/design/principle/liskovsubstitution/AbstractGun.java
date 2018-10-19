package com.chen.design.principle.liskovsubstitution;

/**
 * 枪支的抽象类
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public abstract class AbstractGun {

    /**
     * 特点
     */
    public abstract void features();

    /**
     * 射击
     */
    public abstract void shoot();
}
