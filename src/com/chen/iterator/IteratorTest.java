package com.chen.iterator;

/**
 * 迭代器模式：测试类
 *
 * @Author: LeifChen
 * @Date: 2017-10-01
 */
public class IteratorTest {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}
