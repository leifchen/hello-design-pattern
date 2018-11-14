package com.chen.design.pattern.behavioral.interpreter;

/**
 * NumberInterpreter
 *
 * @Author LeifChen
 * @Date 2018-11-14
 */
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return number;
    }
}
