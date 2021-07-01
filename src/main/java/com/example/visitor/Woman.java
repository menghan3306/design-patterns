package com.example.visitor;

/**
 * @author liubin
 * @date 2021/06/29
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
