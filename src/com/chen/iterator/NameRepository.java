package com.chen.iterator;

/**
 * 迭代器模式：实现了 Container 接口的实体类，实现了 Iterator 接口的内部类 NameIterator
 *
 * @Author: LeifChen
 * @Date: 2017-10-01
 */
public class NameRepository implements Container {

    public String[] names = {"Chen", "Leif", "Julie"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
