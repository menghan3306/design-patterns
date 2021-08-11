package com.example.proxy.dynamic;

/**
 * @author liubin
 * @date 2021/07/27
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        ProxyFactory factory = new ProxyFactory(target);
        ITeacherDao proxyInstance =(ITeacherDao) factory.getProxyInstance();
        System.out.println("proxyInstance=" + proxyInstance.getClass());
        proxyInstance.teach();
    }
}
