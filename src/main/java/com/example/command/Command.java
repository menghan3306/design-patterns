package com.example.command;

/**
 * 命令接口
 * @author liubin
 * @date 2021-04-09
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
