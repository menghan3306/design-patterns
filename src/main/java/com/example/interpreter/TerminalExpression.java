package com.example.interpreter;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void Interpret(Context context) {
        System.out.println("终端解释器");
    }
}
