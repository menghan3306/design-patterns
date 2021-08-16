package com.example.observer;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.add(new ConcreteObserverA());
        subject.add(new ConcreteObserverB());
        subject.notifyObserver();
    }
}
