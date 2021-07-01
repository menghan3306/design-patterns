package com.example.visitor;

/**
 * @author liubin
 * @date 2021/06/29
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
