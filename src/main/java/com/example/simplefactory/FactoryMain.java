package com.example.simplefactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public class FactoryMain {
    public static void main(String[] args) {
        Computer hp = ComputerFactory.createComputer("hp");
        hp.build();
        Computer huashuo = ComputerFactory.createComputer("huashuo");
        huashuo.build();
    }
}
