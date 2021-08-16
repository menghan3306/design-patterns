package com.example.mediator;

/**
 * @author liubin
 * @date 2021/08/13
 */
public abstract class Mediator {
    /**
     * 发送消息
     * @param message 消息
     * @param colleague 发送同事
     */
    public abstract void send(String message, Colleague colleague);

}
