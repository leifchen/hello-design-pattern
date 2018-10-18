package com.chen.design.principle.openclose;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class Test {

    public static void main(String[] args) {
        DiscountBookServiceImpl bookService = new DiscountBookServiceImpl();

        System.out.println("ID: " + bookService.getId() + ", "
                + "名称: " + bookService.getName() + ", "
                + "原价: " + bookService.getOriginalPrice() + ", "
                + "折扣价: " + bookService.getPrice());
    }
}
