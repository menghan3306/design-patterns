package com.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liubin
 * @date 2021/07/01
 */
public class Department extends OrganizationComponent {

    List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
