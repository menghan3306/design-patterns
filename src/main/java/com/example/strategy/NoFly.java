package com.example.strategy;

/**
 * @author liubin
 * @date 2021/09/13
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不能飞翔");
    }
}
