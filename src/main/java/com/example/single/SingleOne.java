package com.example.single;

/**单例模式，饿汉式（静态常量）
 * @author liubin
 * @date 2021-03-26
 */
public class SingleOne {

    /**
     * 构造器私有化，外部可以new
     */
    private SingleOne(){
    }

    /**
     * 本类内部创建对象实例
     */
    private final static SingleOne instance = new SingleOne();

    /**
     * 提供一个公有的静态方法，返回实例对象
     * @return
     */
    public static SingleOne getInstance(){
        return instance;
    }
}
