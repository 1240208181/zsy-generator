package com.zsy.cli.pattern;

/**
 * @author zhusiyuan
 * @date 2023/11/30
 * @apiNote
 */
public class TurnOnCommand implements Command {
    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.turnOn();
    }
}