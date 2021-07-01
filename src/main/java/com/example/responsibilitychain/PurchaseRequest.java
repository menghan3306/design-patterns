package com.example.responsibilitychain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 购买请求
 * @author liubin
 * @date 2021-04-09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest implements Serializable {
    private static final long serialVersionUID = -7386547032706573542L;

    private Integer id;

    private Integer price;
}
