package com.example.visitor;

/**
 * @author liubin
 * @date 2021/06/29
 */
public abstract class Action {

    /**
     * 得到男性测评
     * @param man
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女性测评
     * @param woman
     */
    public abstract void getWomanResult(Woman woman);
}
