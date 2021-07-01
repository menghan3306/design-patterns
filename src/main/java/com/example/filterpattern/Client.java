package com.example.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liubin
 * @date 2021-04-09
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<Consumer> list = new ArrayList<>();
        list.add(new Consumer("PackageOne",38,800));
        list.add(new Consumer("PackageTwo",50,1200));
        list.add(new Consumer("PackageThree",200,2000));

        List<Consumer> consumerList = new FlowFilter().filterConsumers(list);
        System.out.println("流量过滤结果：");
        for (Consumer consumer : consumerList) {
            System.out.println(consumer);
        }

        List<Consumer> priceList = new PriceFilter().filterConsumers(list);
        System.out.println("价格过滤结果：");
        for (Consumer consumer : priceList) {
            System.out.println(consumer);
        }
    }
}
