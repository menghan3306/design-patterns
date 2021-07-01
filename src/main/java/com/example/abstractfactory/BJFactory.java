package com.example.abstractfactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String name) {
        switch (name){
            case "cheese":
                return new BJCheesePizza();
            case "pepper":
                return new BJPepperPizza();
            default:
                return null;
        }
    }
}
