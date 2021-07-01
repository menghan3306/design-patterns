package com.example.bridge;

/**
 * @author liubin
 * @date 2021-04-08
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("竖直手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("竖直手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("竖直手机");
    }
}
