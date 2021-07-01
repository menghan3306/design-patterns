package com.example.single;

/**
 * 单例模式，懒汉式（线程不安全）
 * @author liubin
 * @date 2021-03-26
 */
public class SingleThree {

    private static SingleThree instance;

    private SingleThree(){
    }

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才去创建instance
     * @return instance
     */
    public static SingleThree getInstance(){
        if (instance==null){
            instance = new SingleThree();
        }
        return instance;
    }
}
