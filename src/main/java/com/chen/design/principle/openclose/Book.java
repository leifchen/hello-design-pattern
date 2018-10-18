package com.chen.design.principle.openclose;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * 书
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
@Getter
public class Book {

    private Integer id;
    private String name;
    private BigDecimal price;

    public Book(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
