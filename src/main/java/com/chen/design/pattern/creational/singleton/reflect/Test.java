package com.chen.design.pattern.creational.singleton.reflect;

import java.lang.reflect.Constructor;

/**
 * 反射攻击单例模式测试类
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Test {

    public static void main(String[] args) throws Exception {
        System.out.println("1.类延迟初始化：");
        Class objectClass2 = LazySingleton.class;
        Constructor constructor2 = objectClass2.getDeclaredConstructor();
        constructor2.setAccessible(true);

        // 顺序有关系
        LazySingleton lazy2 = (LazySingleton) constructor2.newInstance();
        LazySingleton lazy1 = LazySingleton.getInstance();

        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);

        System.out.println("2.类加载初始化：");
        Class objectClass1 = HungrySingleton.class;
        Constructor constructor1 = objectClass1.getDeclaredConstructor();
        constructor1.setAccessible(true);

        HungrySingleton hungry2 = (HungrySingleton) constructor1.newInstance();
        HungrySingleton hungry1 = HungrySingleton.getInstance();

        System.out.println(hungry1);
        System.out.println(hungry2);
        System.out.println(hungry1 == hungry2);
    }
}
