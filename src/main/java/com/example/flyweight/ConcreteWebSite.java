package com.example.flyweight;

/**
 * @author liubin
 * @date 2021/07/27
 */
public class ConcreteWebSite extends WebSite {

    /**
     * 网站的发布类型
     */
    private String type;

    public ConcreteWebSite(String type){
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站的发布形式:" + type);
    }
}
