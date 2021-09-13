package com.example.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author liubin
 * @date 2021/09/13
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        Integer[] data = {1,2,4,6,8,3,4,9,0};
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        Arrays.sort(data, comparator);
        System.out.println(Arrays.toString(data));
    }
}
