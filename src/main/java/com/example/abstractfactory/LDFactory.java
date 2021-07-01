package com.example.abstractfactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String name) {
        switch (name){
            case "cheese":
                return new LDCheesePizza();
            case "pepper":
                return new LDPepperPizza();
            default:
                return null;
        }
    }
}
