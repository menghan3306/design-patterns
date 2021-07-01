package com.example.factorymethod;

/**
 * 工厂A
 * @author liubin
 * @date 2021-04-08
 */
public class FactoryA implements AbsFactory {
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }

}
