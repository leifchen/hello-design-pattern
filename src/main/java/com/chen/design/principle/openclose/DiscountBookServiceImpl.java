package com.chen.design.principle.openclose;

import java.math.BigDecimal;

/**
 * 打折后书接口的实现类
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public class DiscountBookServiceImpl extends BookServiceImpl {

    public BigDecimal getOriginalPrice() {
        return super.getPrice();
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(BigDecimal.valueOf(0.8));
    }
}
