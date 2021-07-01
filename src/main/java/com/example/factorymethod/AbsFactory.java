package com.example.factorymethod;

/**
 * @author liubin
 * @date 2021-04-08
 */
public interface AbsFactory {

    /**
     * 制作披萨
     * @return Pizza
     */
    Pizza createPizza();
}
