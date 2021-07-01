package com.example.abstractfactory;

/**
 * 抽象工厂
 * @author liubin
 * @date 2021-03-27
 */
public interface AbsFactory {
    /**
     * 制作Pizza
     * @param name
     * @return Pizza
     */
    Pizza createPizza(String name);
}
