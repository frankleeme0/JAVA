package com.itheima.edu.info.manager.domain;

public class Student extends Person {
    private int a;
//    public Student(String name,String age,String id,String birthday,int a   ){
//        this.a=a;
//
//    }
    public Student(){

    }

    public Student(String id, String name, String age, String birthday) {
        super(id, name, age, birthday);
    }
}
