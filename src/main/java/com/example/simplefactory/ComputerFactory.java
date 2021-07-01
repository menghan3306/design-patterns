package com.example.simplefactory;

/**
 * @author liubin
 * @date 2021-03-27
 */
public class ComputerFactory {
    public static Computer createComputer(String name){
        Computer computer = null;
        switch (name){
            case "hp":
                computer = new HpComputer();
                computer.setName(name);
                break;
            case "huashuo":
                computer = new HuashuoComputer();
                computer.setName(name);
                break;
            default:
                System.out.println("品牌有误");
        }
        return computer;
    }
}
