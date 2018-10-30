package com.chen.design.pattern.structural.adapter.classadapter;

/**
 * 电源类适配器
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public class PowerAdapter extends AC220 implements DC5 {

    @Override
    public int output5V() {
        int adapterInput = super.output220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用电源适配器转换，输入AC：" + adapterInput + "V，输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
