package com.chen.design.principle.openclose;

import java.math.BigDecimal;

/**
 * 书接口的实现类
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class BookServiceImpl implements BookService {

    private final Book book = new Book(1, "Java设计模式", BigDecimal.valueOf(100));

    @Override
    public Integer getId() {
        return book.getId();
    }

    @Override
    public String getName() {
        return book.getName();
    }

    @Override
    public BigDecimal getPrice() {
        return book.getPrice();
    }
}
