package com.example.interpreter;

import java.util.ArrayList;

/**
 * @author liubin
 * @date 2021/08/13
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> list = new ArrayList<>();

        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : list) {
            abstractExpression.Interpret(context);
        }
    }
}
