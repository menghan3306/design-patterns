package com.example.bridge;

/**
 * @author liubin
 * @date 2021-04-08
 */
public class Client {

    public static void main(String[] args) {
        new FoldedPhone(new XiaoMi()).call();
        new FoldedPhone(new Vivo()).call();
        new UpRightPhone(new XiaoMi()).call();
        new UpRightPhone(new Vivo()).call();
    }
}
