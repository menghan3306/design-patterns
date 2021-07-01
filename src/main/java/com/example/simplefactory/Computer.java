package com.example.simplefactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public abstract class Computer {

    private String name;

    /**
     * 启动
     */
    public abstract void build();

    public void setName(String name){
        this.name=name;
    }
}
