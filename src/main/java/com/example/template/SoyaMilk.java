package com.example.template;

/**
 * @author liubin
 * @date 2021/07/31
 */
public abstract class SoyaMilk {

    /**
     * 固定方法，不让子类覆盖
     */
    final void make(){
        this.select();
        this.addCondiments();
        System.out.println("--制作");
    }

    void select(){
        System.out.println("--选材");
    }

    /**
     * 抽象方法，让子类实现
     */
    abstract void addCondiments();
}
