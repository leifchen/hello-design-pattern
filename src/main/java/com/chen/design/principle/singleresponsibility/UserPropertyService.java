package com.chen.design.principle.singleresponsibility;

/**
 * 用户属性接口
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public interface UserPropertyService {

    /**
     * 更新名称
     *
     * @param name
     */
    void updateName(String name);

    /**
     * 更新密码
     *
     * @param password
     */
    void updatePassword(String password);
}
