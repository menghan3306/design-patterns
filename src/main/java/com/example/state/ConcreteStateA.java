package com.example.state;

/**
 * @author liubin
 * @date 2021/08/16
 */
public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态A");
        context.setState(new ConcreteStateB());
    }
}
