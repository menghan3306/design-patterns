package com.example.strategy;

/**
 * @author liubin
 * @date 2021/09/13
 */
public class WildDuck extends Duck {

    public WildDuck(){
        flyBehavior = new GoodFly();
    }
}
