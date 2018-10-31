package com.chen.design.pattern.structural.composite;

import java.math.BigDecimal;

/**
 * 课程
 *
 * @Author LeifChen
 * @Date 2018-10-31
 */
public class Course extends AbstractCatalogComponent {

    private String name;
    private BigDecimal price;

    public Course(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Course Name: " + name + " Price: " + price);
    }
}
