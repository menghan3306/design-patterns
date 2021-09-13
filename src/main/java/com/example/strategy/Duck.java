package com.example.strategy;

/**
 * @author liubin
 * @date 2021/09/13
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    public void swim(){
        System.out.println("鸭子游戏");
    }

    public void fly(){
//        System.out.println("鸭子飞翔");
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
