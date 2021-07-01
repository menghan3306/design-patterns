package com.example.factorymethod;

/**
 * @author liubin
 * @date 2021-04-08
 */
public class Client {

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.createPizza().prepare();

        FactoryB factoryB = new FactoryB();
        factoryB.createPizza().prepare();
    }
}
