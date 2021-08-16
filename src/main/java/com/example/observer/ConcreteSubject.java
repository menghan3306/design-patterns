package com.example.observer;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("目标状态发生改变：");
        for (Observer observer : observerList) {
            observer.response();
        }
    }
}
