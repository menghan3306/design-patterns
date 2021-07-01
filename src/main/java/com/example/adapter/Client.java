package com.example.adapter;

/**
 * @author liubin
 * @date 2021-04-01
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new ClassAdapterVoltage());

        System.out.println("====类适配器====");
        Phone phone1 = new Phone();
        phone1.charging(new ObjAdapterVoltage(new HighVoltage()));
    }
}
