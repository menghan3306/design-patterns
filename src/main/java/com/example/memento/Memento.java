package com.example.memento;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class Memento {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
