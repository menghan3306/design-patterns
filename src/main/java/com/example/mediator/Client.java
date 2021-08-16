package com.example.mediator;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.send("message", new ConcreteColleagueA());
        mediator.send("message", new ConcreteColleagueB());
    }
}
