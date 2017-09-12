package com.chen.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: 套餐
 * @Author: LeifChen
 * @Date: 2017-09-12
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    /**
     * 点餐
     *
     * @param item
     */
    public void addItem(Item item) {
        itemList.add(item);
    }

    /**
     * 总价
     *
     * @return
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 订单明细
     */
    public void showItems() {
        for (Item item : itemList) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

}
