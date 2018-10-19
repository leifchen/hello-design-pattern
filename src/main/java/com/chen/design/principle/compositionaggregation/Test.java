package com.chen.design.principle.compositionaggregation;

/**
 * 测试类
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public class Test {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySqlConnection());
        productDao.addProduct();

        productDao.setDbConnection(new PostgreSqlConnection());
        productDao.addProduct();
    }
}
