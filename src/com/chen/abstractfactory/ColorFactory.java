package com.chen.abstractfactory;

/**
 * Description: 抽象工厂模式 Color工厂
 * Author: LeifChen
 * Date: 2017-09-11
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String colorType) {
        Color color = null;
        switch (colorType.toUpperCase()) {
            case ColorConstant.COLOR_RED:
                color = new Red();
                break;
            case ColorConstant.COLOR_GREEN:
                color = new Green();
                break;
            case ColorConstant.COLOR_BLUE:
                color = new Blue();
                break;
        }
        return color;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }

}
