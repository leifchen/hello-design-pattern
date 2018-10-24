package com.chen.design.pattern.creational.singleton.serialization;

import java.io.*;

/**
 * 序列化破坏单例模式测试类
 *
 * @Author LeifChen
 * @Date 2018-10-24
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton newInstance = (Singleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
