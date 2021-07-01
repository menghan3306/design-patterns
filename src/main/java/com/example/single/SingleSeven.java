package com.example.single;

/**
 * 单例模式，静态内部类
 * @author liubin
 * @date 2021-03-26
 */
public class SingleSeven {

    private SingleSeven(){}

    private static class SingleInstance{
        private static final SingleSeven INSTANCE = new SingleSeven();
    }

    public static SingleSeven getInstance(){
        return SingleInstance.INSTANCE;
    }
}
