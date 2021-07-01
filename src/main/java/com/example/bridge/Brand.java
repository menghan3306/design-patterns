package com.example.bridge;

/**
 * 手机品牌
 * @author liubin
 * @date 2021-04-08
 */
public interface Brand {

    /**
     * 开机
     */
    void open();

    /**
     * 关机
     */
    void close();

    /**
     * 打电话
     */
    void call();
}
