package com.example.adapter;

/**
 * 被适配的类
 * @author liubin
 * @date 2021-04-01
 */
public class HighVoltage {

    /**
     * 输出220V电压
     * @return
     */
    public Integer outputHigh(){
        int src = 220;
        System.out.println("输出电压："+src);
        return src;
    }
}
