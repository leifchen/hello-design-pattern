package com.chen.builder;

/**
 * @Desc: 建造者模式：套餐Builder
 * @Author: LeifChen
 * @Date: 2017-09-12
 */
public class MealBuilder {

    /**
     * 素食套餐
     *
     * @return
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 肉食套餐
     *
     * @return
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
