package com.example.composite;

/**
 * @author liubin
 * @date 2021/07/01
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "国内一流大学");
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院不错");
        OrganizationComponent informationCollege = new College("信息学院", "信息学院不错");
        computerCollege.add(new Department("计算机1专业","计算机1专业不错"));
        computerCollege.add(new Department("计算机2专业","计算机2专业不错"));
        informationCollege.add(new Department("信息1专业","信息1专业不错"));
        informationCollege.add(new Department("信息2专业","信息2专业不错"));
        university.add(computerCollege);
        university.add(informationCollege);
        university.print();
    }
}
