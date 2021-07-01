package com.example.factorymethod;

/**
 * 工厂B
 * @author liubin
 * @date 2021-04-08
 */
public class FactoryB implements AbsFactory {
    @Override
    public Pizza createPizza() {
        return new PepperPizza();
    }
}
