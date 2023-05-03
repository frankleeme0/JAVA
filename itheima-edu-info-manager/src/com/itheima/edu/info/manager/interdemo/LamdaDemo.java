package com.itheima.edu.info.manager.interdemo;

public class LamdaDemo {
    public static void main(String[] args) {
        new Inter0Impl().show();


        new Inter1(){

            @Override
            public void show() {
                System.out.println("我是匿名内部类");
            }
        }.show();
    }
}
interface  Inter1{
    void show();
}

class Inter0Impl implements Inter1{

    @Override
    public void show() {
        System.out.println("重写了show方法");
    }
}
