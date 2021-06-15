package com.ngsolutions.collabrativetask.models;

import io.realm.RealmObject;

public class RealmTestModel extends RealmObject {
    String Name;
    int age;

    public RealmTestModel(String name, int age) {
        Name = name;
        this.age = age;
    }

    public RealmTestModel() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
