package com.zsy.cli.pattern;

/**
 * @author zhusiyuan
 * @date 2023/11/30
 * @apiNote
 */
public class TurnOffCommand implements Command {
    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }
}