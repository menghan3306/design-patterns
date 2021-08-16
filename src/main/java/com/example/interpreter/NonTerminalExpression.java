package com.example.interpreter;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class NonTerminalExpression extends AbstractExpression {
    @Override
    public void Interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
