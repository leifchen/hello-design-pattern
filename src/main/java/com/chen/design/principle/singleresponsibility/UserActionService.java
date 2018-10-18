package com.chen.design.principle.singleresponsibility;

/**
 * 用户行为接口
 *
 * @Author LeifChen
 * @Date 2018-10-18
 */
public interface UserActionService {

    /**
     * 保存用户
     */
    void saveUser();

    /**
     * 删除用户
     */
    void deleteUser();
}
