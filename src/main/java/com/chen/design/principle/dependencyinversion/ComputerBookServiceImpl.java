package com.chen.design.principle.dependencyinversion;

/**
 * 计算机类别图书
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class ComputerBookServiceImpl implements BookService {

    @Override
    public void sell() {
        System.out.println("销售：计算机类别图书");
    }
}
