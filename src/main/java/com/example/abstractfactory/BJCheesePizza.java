package com.example.abstractfactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public class BJCheesePizza extends BJPizza {
    @Override
    public void prepare() {
        System.out.println("准备北京奶酪Pizza");
    }
}
