package com.example.bridge;

/**
 * @author liubin
 * @date 2021-04-08
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米开机");
    }

    @Override
    public void close() {
        System.out.println("小米关机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }
}
