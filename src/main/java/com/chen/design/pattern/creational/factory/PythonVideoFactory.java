package com.chen.design.pattern.creational.factory;

/**
 * PythonVideoFactory
 *
 * @Author LeifChen
 * @Date 2018-10-22
 */
public class PythonVideoFactory extends AbstractVideoFactory {

    @Override
    public AbstractVideo getVideo() {
        return new PythonVideo();
    }
}
