package com.example.command;

/**
 * @author liubin
 * @date 2021/06/29
 */
public class Client {
    public static void main(String[] args) {
        //创建电灯对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //创建遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        System.out.println("-----按下开的按钮-----");
        remoteController.onButtonPushed(0);
        System.out.println("-----按下关的按钮-----");
        remoteController.ofButtonPushed(0);
        System.out.println("-----按下撤销的按钮-----");
        remoteController.undoButtonPushed();
    }
}
