package com.example.adapter.interadapter;

/**
 * @author liubin
 * @date 2021-04-07
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void method2() {
                System.out.println("使用method2方法");
            }
        };
        absAdapter.method2();
    }
}
