package com.example.single;

/**
 * 单例模式，饿汉式（静态代码块）
 * @author liubin
 * @date 2021-03-26
 */
public class SingleTwo {

    private SingleTwo(){

    }

    private static SingleTwo instance;

    static {
        instance = new SingleTwo();
    }

    public static SingleTwo getInstance(){
        return instance;
    }
}
