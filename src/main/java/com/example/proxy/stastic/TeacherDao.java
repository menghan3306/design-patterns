package com.example.proxy.stastic;

/**
 * @author liubin
 * @date 2021/07/27
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中。。。。");
    }
}
