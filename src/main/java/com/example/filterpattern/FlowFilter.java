package com.example.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 流量过滤器
 * @author liubin
 * @date 2021-04-09
 */
public class FlowFilter implements Filter{
    @Override
    public List<Consumer> filterConsumers(List<Consumer> consumerList) {
        ArrayList<Consumer> consumers = new ArrayList<>();
        for (Consumer consumer : consumerList) {
            //过滤出套餐流量1G以上的
            if (consumer.getFlow()>1000){
                consumers.add(consumer);
            }
        }
        return consumers;
    }
}
