package com.example.memento;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        state = memento.getState();
    }
}
