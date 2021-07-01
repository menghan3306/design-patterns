package com.example.filterpattern;

import java.util.List;

/**
 * 抽象过滤器接口
 * @author liubin
 * @date 2021-04-09
 */
public interface Filter {

    /**
     * 过滤筛选出需要的套餐
     * @param consumerList 套餐列表
     * @return 过滤后的套餐列表
     */
    List<Consumer> filterConsumers(List<Consumer> consumerList);
}
