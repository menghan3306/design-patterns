package com.example.mediator;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void send(String message, Colleague colleague) {
        colleague.notifyMessage(message);
    }
}
