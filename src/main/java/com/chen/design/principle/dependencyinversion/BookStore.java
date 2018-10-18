package com.chen.design.principle.dependencyinversion;

/**
 * 书店
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class BookStore {

    public void sellBook(BookService book) {
        book.sell();
    }
}
