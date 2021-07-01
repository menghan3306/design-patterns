package com.example.single;

/**
 * 单例模式，懒汉式（线程安全，同步方法）
 * @author liubin
 * @date 2021-03-26
 */
public class SingleFour {

    private static SingleFour instance;

    private SingleFour(){

    }

    /**
     * 加一段同步代码
     * @return instance
     */
    public static synchronized SingleFour getInstance(){
        if (instance == null){
            instance = new SingleFour();
        }
        return instance;
    }
}
