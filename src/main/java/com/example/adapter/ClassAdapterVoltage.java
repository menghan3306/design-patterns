package com.example.adapter;

/**
 * 类适配器
 * @author liubin
 * @date 2021-04-01
 */
public class ClassAdapterVoltage extends HighVoltage implements LowVoltage{
    @Override
    public Integer outputLow() {
        Integer src = outputHigh();
        int dst = src - 215;
        System.out.println("电压转换："+dst);
        return dst;
    }
}
