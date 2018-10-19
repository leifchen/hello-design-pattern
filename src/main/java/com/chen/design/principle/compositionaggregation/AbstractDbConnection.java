package com.chen.design.principle.compositionaggregation;

/**
 * 数据库连接
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public abstract class AbstractDbConnection {

    /**
     * 获取连接
     *
     * @return
     */
    public abstract String getConnection();
}
