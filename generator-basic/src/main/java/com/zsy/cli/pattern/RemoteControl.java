package com.zsy.cli.pattern;

/**
 * @author zhusiyuan
 * @date 2023/11/30
 * @apiNote
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}