package com.example.adapter;

/**
 * 对象适配器
 * @author liubin
 * @date 2021-04-07
 */
public class ObjAdapterVoltage implements LowVoltage {

    private HighVoltage highVoltage;

    /**
     * 通过构造器传入高电压实例
     * @param highVoltage 高电压
     */
    public ObjAdapterVoltage(HighVoltage highVoltage){
        this.highVoltage = highVoltage;
    }

    @Override
    public Integer outputLow() {
        Integer dst = 0;
        if (null!=highVoltage){
            Integer src = highVoltage.outputHigh();
            dst = src - 215;
            System.out.println("电压转换："+dst);
        }
        return dst;
    }
}
