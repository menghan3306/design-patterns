package com.example.proxy.cglib;

/**
 * @author liubin
 * @date 2021/07/30
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
