package com.example.visitor;

/**
 * @author liubin
 * @date 2021/06/29
 */
public abstract class Person {
    public abstract void accept(Action action);
}
