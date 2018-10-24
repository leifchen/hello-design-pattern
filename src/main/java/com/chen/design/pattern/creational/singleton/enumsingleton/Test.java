package com.chen.design.pattern.creational.singleton.enumsingleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 枚举单例模式测试类
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        instance.setData(new Object());

        // 枚举单例的序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        // 枚举单例的反序列化
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton newInstance = (Singleton) ois.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());

        Class objectClass = Singleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        // 枚举单例可以禁止构造器的反射调用
        constructor.newInstance("LeifChen", 2018);
    }
}
