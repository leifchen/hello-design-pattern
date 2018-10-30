package com.chen.design.pattern.structural.adapter.objectadapter;

/**
 * 对象适配器测试类
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("对象适配器模式：");
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.output5V();
    }
}
