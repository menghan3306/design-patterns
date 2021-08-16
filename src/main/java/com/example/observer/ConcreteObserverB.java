package com.example.observer;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("观察者B做出反应");
    }
}
