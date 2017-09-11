package com.chen.abstractfactory;

/**
 * Description: 抽象工厂模式 抽象工厂类
 * Author: LeifChen
 * Date: 2017-09-11
 */
public abstract class AbstractFactory {

    /**
     * 获取Color工厂
     */
    abstract Color getColor(String color);

    /**
     * 获取Shape工厂
     */
    abstract Shape getShape(String shape);

}
