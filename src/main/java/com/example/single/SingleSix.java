package com.example.single;

/**
 * 单例模式，双重检查
 * @author liubin
 * @date 2021-03-26
 */
public class SingleSix {
    private static volatile SingleSix instance;

    private SingleSix(){}

    public static SingleSix getInstance(){
        if (instance == null){
            synchronized (SingleSix.class){
                if (instance == null){
                    instance = new SingleSix();
                }
            }
        }
        return instance;
    }
}
