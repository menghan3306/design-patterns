package com.example.command;

/**
 * @author liubin
 * @date 2021-04-09
 */
public class LightOffCommand implements Command {

    /**
     * 聚合LightReceiver
     */
    LightReceiver lightReceiver;

    /**
     * 构造器
     * @param lightReceiver
     */
    public LightOffCommand(LightReceiver lightReceiver){
        super();
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.lightOff();
    }

    @Override
    public void undo() {
        lightReceiver.lightOn();
    }
}
