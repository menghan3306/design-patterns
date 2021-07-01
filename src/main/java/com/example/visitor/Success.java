package com.example.visitor;

/**
 * @author liubin
 * @date 2021/06/29
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男性朋友的评价：成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女性朋友的评价：成功");
    }
}
