package com.example.composite;

import lombok.Data;

/**
 * @author liubin
 * @date 2021/07/01
 */
@Data
public abstract class OrganizationComponent {

    private String name;
    private String des;

    public OrganizationComponent(String name, String des){
        super();
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected abstract void print();
}
