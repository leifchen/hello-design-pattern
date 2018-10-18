package com.chen.design.principle.openclose;

import java.math.BigDecimal;

/**
 * 书的接口
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public interface BookService {

    /**
     * 获取id
     *
     * @return
     */
    Integer getId();

    /**
     * 获取名称
     *
     * @return
     */
    String getName();

    /**
     * 获取价格
     *
     * @return
     */
    BigDecimal getPrice();
}
