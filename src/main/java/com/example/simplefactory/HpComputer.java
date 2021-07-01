package com.example.simplefactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public class HpComputer extends Computer {
    @Override
    public void build() {
        System.out.println("生产惠普");
    }
}
