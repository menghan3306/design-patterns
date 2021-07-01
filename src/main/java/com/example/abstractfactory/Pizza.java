package com.example.abstractfactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public abstract class Pizza {
    /**
     * 准备Pizza
     */
    public abstract void prepare();

    public void bake(){
        System.out.println("烘焙");
    }

    public void cut(){
        System.out.println("切");
    }

    public void box(){
        System.out.println("烤");
    }
}
