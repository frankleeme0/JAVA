package com.itheima.edu.info.manager.lambdademo;

import java.math.BigDecimal;

public class TestSwimming {
    public TestSwimming() {
    }


    

    public static void main(String[] args) {


//        int abs = Math.abs(-10);
//        double ceil = Math.ceil(-10.1);
//        long round = Math.round(11.5);
//        int i = Math.absExact(abs);
//        System.out.println(round);
//        String s="ss";
//        String ss="ss";
//        System.out.println(s.equals(ss));
        BigDecimal bd1=new BigDecimal("0.1");
        BigDecimal bd2=new BigDecimal("0.2");
        BigDecimal add = bd1.add(bd2);
        System.out.println(add);


        goSwim(new Swim() {
            @Override
            public void swim() {
                System.out.println("去游泳吧");
            }
        });
        goSwim(()-> System.out.println("去游泳 ")
        );
    }
    static void goSwim(Swim swim){
        swim.swim();
    }
}
interface Swim{
    void  swim();
}
