package com.example.iterator;

import java.util.Iterator;

/**
 * @author liubin
 * @date 2021/08/11
 */
public interface College {

    public void addDepartment(String name, String desc);

    public Iterator createIterator();
}
