package com.example.command;

/**
 * 空命令，没有任何执行，用来初始化每个按钮
 * 调用空命令时，对象什么都不做
 * @author liubin
 * @date 2021/06/29
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
