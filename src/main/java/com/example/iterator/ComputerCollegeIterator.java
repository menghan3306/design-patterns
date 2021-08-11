package com.example.iterator;

import java.util.Iterator;

/**
 * @author liubin
 * @date 2021/08/11
 */
public class ComputerCollegeIterator implements Iterator<Department> {

    Department[] departments;

    /**
     * 遍历的位置
     */
    int position = 0;

    public ComputerCollegeIterator(Department[] departments){
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Department next() {
        Department department = departments[position];
        position++;
        return department;
    }

    /**
     * 删除的方法，默认空实现
     */
    @Override
    public void remove(){}
}
