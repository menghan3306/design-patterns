package com.example.flyweight;

/**
 * @author liubin
 * @date 2021/07/27
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use();
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use();
        WebSite webSite3 = factory.getWebSiteCategory("新闻");
        webSite3.use();
        System.out.println(factory.getWebSiteCount());
    }
}
