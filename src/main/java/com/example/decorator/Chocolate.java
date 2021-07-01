package com.example.decorator;

/**
 * @author liubin
 * @date 2021/07/01
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0);
    }
}
