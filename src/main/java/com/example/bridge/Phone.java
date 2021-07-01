package com.example.bridge;

/**
 * @author liubin
 * @date 2021-04-08
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }

    protected void open(){
        brand.open();
    }

    protected void close(){
        brand.close();
    }

    protected void call(){
        brand.call();
    }
}
