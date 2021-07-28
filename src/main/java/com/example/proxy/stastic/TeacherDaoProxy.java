package com.example.proxy.stastic;

/**
 * @author liubin
 * @date 2021/07/27
 */
public class TeacherDaoProxy implements ITeacherDao {

    private TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao){
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("--开始代理");
        teacherDao.teach();
        System.out.println("--代理完成");
    }
}
