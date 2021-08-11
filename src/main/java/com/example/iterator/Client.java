package com.example.iterator;

import java.util.Iterator;

/**
 * @author liubin
 * @date 2021/08/11
 */
public class Client {
    public static void main(String[] args) {
        ComputerCollege computerCollege = new ComputerCollege();
        computerCollege.addDepartment("1号学院","1");
        computerCollege.addDepartment("2号学院","2");
        computerCollege.addDepartment("3号学院","3");
        Iterator<Department> iterator = computerCollege.createIterator();
        while (iterator.hasNext()){
            Department next = iterator.next();
            System.out.println(next);
        }

    }
}
