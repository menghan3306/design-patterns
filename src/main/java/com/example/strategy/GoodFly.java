package com.example.strategy;

/**
 * @author liubin
 * @date 2021/09/13
 */
public class GoodFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("擅长飞翔");
    }
}
