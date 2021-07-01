package com.example.decorator;

/**
 * @author liubin
 * @date 2021/07/01
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(1.5);
    }
}
