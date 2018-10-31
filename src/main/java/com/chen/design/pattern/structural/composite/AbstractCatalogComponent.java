package com.chen.design.pattern.structural.composite;

import java.math.BigDecimal;

/**
 * 课程组合目录的抽象类
 *
 * @Author LeifChen
 * @Date 2018-10-31
 */
public abstract class AbstractCatalogComponent {

    public void add(AbstractCatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(AbstractCatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public BigDecimal getPrice(){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
