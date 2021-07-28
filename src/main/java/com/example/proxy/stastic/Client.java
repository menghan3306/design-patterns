package com.example.proxy.stastic;

/**
 * @author liubin
 * @date 2021/07/27
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());
        proxy.teach();

    }
}
