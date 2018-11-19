package com.chen.design.pattern.behavioral.state;

/**
 * 状态
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public interface State {

    /**
     * 执行动作
     *
     * @param context
     */
    void doAction(Context context);
}
