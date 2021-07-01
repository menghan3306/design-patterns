package com.example.command;

/**
 * 台灯的命令操作
 * @author liubin
 * @date 2021-04-09
 */
public class LightOnCommand implements Command {

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.lightOn();
    }

    @Override
    public void undo() {
        lightReceiver.lightOff();
    }
}
