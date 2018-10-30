package com.chen.design.pattern.structural.adapter.interfaceadapter;

/**
 * 电源抽象适配器
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public abstract class AbstractPowerAdapter implements DCOutput {

    protected AC220 ac220;

    public AbstractPowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }
}
