package com.example.state;

/**
 * @author liubin
 * @date 2021/08/16
 */
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态B");
        context.setState(new ConcreteStateA());
    }
}
