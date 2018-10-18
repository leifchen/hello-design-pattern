package com.chen.design.principle.demeter;

import java.util.List;

/**
 * 组长
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class GroupLeader {

    private List<Girl> girls;

    public GroupLeader(List<Girl> girls) {
        this.girls = girls;
    }

    public void countGirls() {
        System.out.println("女生的数量是：" + girls.size());
    }
}
