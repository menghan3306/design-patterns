package com.example.strategy;

/**
 * @author liubin
 * @date 2021/09/13
 */
public class BadFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不擅长飞翔");
    }
}
