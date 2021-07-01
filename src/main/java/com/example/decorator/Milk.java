package com.example.decorator;

/**
 * @author liubin
 * @date 2021/07/01
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0);
    }

}
