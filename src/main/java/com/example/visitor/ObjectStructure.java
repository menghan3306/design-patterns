package com.example.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liubin
 * @date 2021/06/29
 */
public class ObjectStructure {

    private List<Person> personList = new ArrayList<>();

    public void attach(Person person){
        personList.add(person);
    }

    public void detach(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        for (Person person : personList) {
            person.accept(action);
        }
    }
}
