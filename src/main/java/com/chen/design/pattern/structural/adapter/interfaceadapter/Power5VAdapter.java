package com.chen.design.pattern.structural.adapter.interfaceadapter;

/**
 * 5V电源适配器
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public class Power5VAdapter extends AbstractPowerAdapter {

    public Power5VAdapter(AC220 ac220) {
        super(ac220);
    }

    @Override
    public int output5V() {
        int adapterInput = super.ac220.output220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用电源适配器转换，输入AC：" + adapterInput + "V，输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
