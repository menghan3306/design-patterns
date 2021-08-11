package com.example.iterator;

import java.util.Iterator;

/**
 * @author liubin
 * @date 2021/08/11
 */
public class ComputerCollege implements College {

    Department[] departments;

    /**
     * 保存当前数组的对象个数
     */
    int numOfDepartment = 0;

    public ComputerCollege(){
        this.departments = new Department[5];
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
