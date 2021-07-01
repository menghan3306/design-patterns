package com.example.adapter;

/**
 * @author liubin
 * @date 2021-04-01
 */
public class Phone {

    /**
     * 充电
     * @param lowVoltage
     */
    public void charging(LowVoltage lowVoltage){
        if (lowVoltage.outputLow()==5){
            System.out.println("开始充电");
        }else {
            System.out.println("无法充电");
        }
    }
}
