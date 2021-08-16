package com.example.mediator;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class ConcreteColleagueA extends Colleague {
    @Override
    public void notifyMessage(String message) {
        System.out.println("A收到消息："+message);
    }
}
