package com.example.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 价格过滤器
 * @author liubin
 * @date 2021-04-09
 */
public class PriceFilter implements Filter{
    @Override
    public List<Consumer> filterConsumers(List<Consumer> consumerList) {
        ArrayList<Consumer> consumers = new ArrayList<>();
        for (Consumer consumer : consumerList) {
            //过滤出套餐价格100以内的
            if (consumer.getPrice()<100){
                consumers.add(consumer);
            }
        }
        return consumers;
    }
}
