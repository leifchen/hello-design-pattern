package com.chen.design.principle.liskovsubstitution;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public class Test {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setGun(new HandGun());
        soldier.startShoot();

        soldier.setGun(new RifleGun());
        soldier.startShoot();
    }
}
