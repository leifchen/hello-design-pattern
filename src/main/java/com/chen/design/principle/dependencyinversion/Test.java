package com.chen.design.principle.dependencyinversion;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class Test {

    public static void main(String[] args) {
        BookStore store = new BookStore();
        store.sellBook(new ComputerBookServiceImpl());
        store.sellBook(new NovelBookServiceImpl());
    }
}
