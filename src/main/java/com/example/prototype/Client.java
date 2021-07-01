package com.example.prototype;

/**
 * @author liubin
 * @date 2021-03-29
 */
public class Client {

    public static void main(String[] args) {
        Sheep one = new Sheep("one", 18,new Integer[]{1,2,3});
//        Sheep two = one.deepClone();
//        Sheep three = one.deepClone();

        Sheep two = one.clone();
        Sheep three = one.clone();

        System.out.println(one.toString()+one.getInfos().hashCode());
        System.out.println(two.toString()+two.getInfos().hashCode());
        System.out.println(three.toString()+three.getInfos().hashCode());

    }
}
