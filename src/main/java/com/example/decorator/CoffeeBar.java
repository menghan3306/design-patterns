package com.example.decorator;

/**
 * @author liubin
 * @date 2021/07/01
 */
public class CoffeeBar {

    public static void main(String[] args) {

        //点一份long black
        Drink longBlack = new LongBlack();
        System.out.println(longBlack.getDes() + "费用：" + longBlack.cost());
        //加一点牛奶
        longBlack = new Milk(longBlack);
        System.out.println(longBlack.getDes() + "费用：" + longBlack.cost());
        //再加一份巧克力
        longBlack = new Chocolate(longBlack);
        System.out.println(longBlack.getDes() + "费用：" + longBlack.cost());
        //再加一份巧克力
        longBlack = new Chocolate(longBlack);
        System.out.println(longBlack.getDes() + "费用：" + longBlack.cost());
    }
}
