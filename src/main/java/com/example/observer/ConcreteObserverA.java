package com.example.observer;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void response() {
        System.out.println("观察者A做出反应");
    }
}
