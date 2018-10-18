package com.chen.design.principle.dependencyinversion;

/**
 * 小说类别图书
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class NovelBookServiceImpl implements BookService {

    @Override
    public void sell() {
        System.out.println("销售：小说类别图书");
    }
}
