package com.example.single;

/**单例模式，懒汉式（线程安全，同步代码块）
 * @author liubin
 * @date 2021-03-26
 */
public class SingleFive {
    private SingleFive(){

    }

    private static SingleFive instance;

    public static SingleFive getInstance(){
        if (instance == null){
            synchronized (SingleFive.class) {
                instance = new SingleFive();
            }
        }
        return instance;
    }
}
