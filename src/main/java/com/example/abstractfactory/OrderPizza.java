package com.example.abstractfactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public class OrderPizza {
    public static Pizza createPizza(AbsFactory absFactory,String name){
        return absFactory.createPizza(name);
    }

    public static void main(String[] args) {
        createPizza(new BJFactory(),"cheese").prepare();
        createPizza(new BJFactory(),"pepper").prepare();
        createPizza(new LDFactory(),"cheese").prepare();
        createPizza(new LDFactory(),"pepper").prepare();

    }
}
