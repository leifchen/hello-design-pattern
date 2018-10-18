package com.chen.design.principle.demeter;

/**
 * 老师
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class Teacher {

    public void command(GroupLeader groupLeader) {
        groupLeader.countGirls();
    }
}
