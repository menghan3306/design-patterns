package com.example.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 产品 --> Product
 * @author liubin
 * @date 2021-03-31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {
    private String basic;
    private String wall;
    private String roofed;
}
