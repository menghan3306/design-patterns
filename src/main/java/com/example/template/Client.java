package com.example.template;

/**
 * @author liubin
 * @date 2021/07/31
 */
public class Client {
    public static void main(String[] args) {
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
