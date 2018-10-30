package com.chen.design.pattern.structural.adapter.objectadapter;

/**
 * 电源对象适配器
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.output220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用电源适配器转换，输入AC：" + adapterInput + "V，输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
