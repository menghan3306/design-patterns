package com.example.decorator;

import lombok.Data;

/**
 * @author liubin
 * @date 2021/07/01
 */
@Data
public abstract class Drink {

    public String des;

    private Double price = 0.0;

    /**
     * 计算费用的抽象方法
     * @return 费用
     */
    public abstract Double cost();
}
