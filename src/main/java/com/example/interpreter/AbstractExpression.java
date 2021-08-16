package com.example.interpreter;

/**
 * @author liubin
 * @date 2021/08/13
 */
public abstract class AbstractExpression {
    /**
     * 解释器的抽象方法
     * @param context 环境角色
     */
    public abstract void Interpret(Context context);
}
