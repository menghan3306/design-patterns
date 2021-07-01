package com.example.filterpattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 客户的手机套餐
 * @author liubin
 * @date 2021-04-09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consumer implements Serializable {
    private static final long serialVersionUID = -2830434210628625159L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 套餐价格
     */
    private Integer price;

    /**
     * 套餐流量
     */
    private Integer flow;

}
