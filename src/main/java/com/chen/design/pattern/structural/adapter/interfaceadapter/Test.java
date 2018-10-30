package com.chen.design.pattern.structural.adapter.interfaceadapter;

/**
 * 对象适配器测试类
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("接口适配器模式：");
        DCOutput adapter = new Power5VAdapter(new AC220());
        adapter.output5V();
    }
}
