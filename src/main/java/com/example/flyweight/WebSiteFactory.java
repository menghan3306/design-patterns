package com.example.flyweight;

import java.util.HashMap;

/**
 * @author liubin
 * @date 2021/07/27
 */
public class WebSiteFactory {

    /**
     * 集合，充当池的作用
     */
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public Integer getWebSiteCount(){
        return pool.size();
    }
}
