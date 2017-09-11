package com.chen.abstractfactory;

/**
 * Description: 抽象工厂模式 工厂创造器
 * Author: LeifChen
 * Date: 2017-09-11
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase(ShapeConstant.SHAPE)) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase(ColorConstant.COLOR)) {
            return new ColorFactory();
        }
        return null;
    }

}
