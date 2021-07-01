package com.example.decorator;

/**
 * 装饰者
 * @author liubin
 * @date 2021/07/01
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public Double cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes(){
        //输出装饰者信息
        return super.des + " " + super.getPrice() + "&&" + drink.getDes();
    }
}
