package com.example.single;

/**
 * @author liubin
 * @date 2021-03-26
 */
public class SingleMain {
    public static void main(String[] args) {
        SingleOne instance1 = SingleOne.getInstance();
        SingleOne instance2 = SingleOne.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        /*SingleTwo instance1 = SingleTwo.getInstance();
        SingleTwo instance2 = SingleTwo.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());*/

        /*SingleThree instance1 = SingleThree.getInstance();
        SingleThree instance2 = SingleThree.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());*/

        /*SingleSeven instance1 = SingleSeven.getInstance();
        SingleSeven instance2 = SingleSeven.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());*/

       /* SingleEight instance1 = SingleEight.INSTANCE;
        SingleEight instance2 = SingleEight.INSTANCE;
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());*/

    }
}
