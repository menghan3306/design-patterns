package com.example.single;

/**
 * 单例模式，枚举
 * @author liubin
 * @date 2021-03-26
 */
public enum SingleEight {
    INSTANCE;

    public void doSomething(){
        System.out.println("say hello");
    }
}
