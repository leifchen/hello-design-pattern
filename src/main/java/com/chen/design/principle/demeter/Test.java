package com.chen.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class Test {

    public static void main(String[] args) {
        List<Girl> girls = new ArrayList<>();
        int random = new Random().nextInt(50);
        for (int i = 0; i < random; i++) {
            girls.add(new Girl());
        }

        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(girls));
    }
}
