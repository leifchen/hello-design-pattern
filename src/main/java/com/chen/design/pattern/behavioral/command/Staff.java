package com.chen.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 工作人员
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class Staff {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        commandList.forEach(Command::execute);
        commandList.clear();
    }
}
