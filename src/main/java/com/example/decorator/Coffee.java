package com.example.decorator;

/**
 * @author liubin
 * @date 2021/07/01
 */
public class Coffee extends Drink {
    @Override
    public Double cost() {
        return super.getPrice();
    }
}
