package com.example.bridge;

/**
 * @author liubin
 * @date 2021-04-08
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo打电话");
    }
}
