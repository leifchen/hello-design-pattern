package com.chen.design.pattern.structural.adapter.interfaceadapter;

/**
 * 输出直流电
 *
 * @Author LeifChen
 * @Date 2018-10-30
 */
public interface DCOutput {

    /**
     * 输出5V
     * @return
     */
    int output5V();

    /**
     * 输出12V
     * @return
     */
    int output12V();

    /**
     * 输出24V
     * @return
     */
    int output24V();
}
