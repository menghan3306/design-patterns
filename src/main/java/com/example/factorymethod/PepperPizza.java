package com.example.factorymethod;

/**
 * @author liubin
 * @date 2021-04-08
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备胡椒披萨");
    }
}
