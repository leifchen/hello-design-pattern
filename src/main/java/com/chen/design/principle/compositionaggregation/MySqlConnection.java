package com.chen.design.principle.compositionaggregation;

/**
 * MySQL数据库
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public class MySqlConnection extends AbstractDbConnection {

    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
