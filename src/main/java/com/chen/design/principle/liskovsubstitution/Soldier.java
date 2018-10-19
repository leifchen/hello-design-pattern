package com.chen.design.principle.liskovsubstitution;

/**
 * 士兵
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public class Soldier {

    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void startShoot(){
        gun.features();
        gun.shoot();
    }
}
