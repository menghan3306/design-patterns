package com.example.facade;

/**
 * @author liubin
 * @date 2021/07/23
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.openSystem();
        facade.closeSystem();
    }
}
