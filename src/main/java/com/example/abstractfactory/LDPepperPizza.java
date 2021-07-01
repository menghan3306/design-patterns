package com.example.abstractfactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public class LDPepperPizza extends LDPizza {
    @Override
    public void prepare() {
        System.out.println("准备伦敦胡椒Pizza");
    }
}
