package com.example.mediator;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class ConcreteColleagueB extends Colleague {
    @Override
    public void notifyMessage(String message) {
        System.out.println("B收到消息："+message);
    }
}
