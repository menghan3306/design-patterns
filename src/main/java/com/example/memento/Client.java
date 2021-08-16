package com.example.memento;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        System.out.println(originator.getState());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("off");
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
