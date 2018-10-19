package com.chen.design.principle.compositionaggregation;

/**
 * PostgreSQL数据库
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public class PostgreSqlConnection extends AbstractDbConnection {

    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
