package com.chen.design.principle.compositionaggregation;

/**
 * 产品Dao
 *
 * @Author LeifChen
 * @Date 2018-10-19
 */
public class ProductDao {

    private AbstractDbConnection dbConnection;

    public void setDbConnection(AbstractDbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "，增加产品");
    }
}
