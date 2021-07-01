package com.example.command;

/**
 * @author liubin
 * @date 2021/06/29
 */
public class RemoteController {

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteController(){
        //以三组按钮为例
        onCommands = new Command[3];
        offCommands = new Command[3];
        //按钮初始化
        for (int i=0; i<3; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(Integer no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开的按钮
     * @param no
     */
    public void onButtonPushed(Integer no){
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    /**
     * 按下关的按钮
     * @param no
     */
    public void ofButtonPushed(Integer no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonPushed(){
        undoCommand.undo();
    }
}
