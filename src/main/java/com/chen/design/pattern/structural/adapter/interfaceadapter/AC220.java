package com.chen.design.pattern.structural.adapter.interfaceadapter;

/**
 * 交流电220V
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public class AC220 {

    public int output220V() {
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }
}
