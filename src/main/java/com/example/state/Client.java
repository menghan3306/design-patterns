package com.example.state;

/**
 * @author liubin
 * @date 2021/08/16
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
