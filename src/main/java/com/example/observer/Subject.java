package com.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liubin
 * @date 2021/08/13
 */
public abstract class Subject {
    public List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer){
        observerList.add(observer);
    }

    public void remove(Observer observer){
        observerList.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();
}
