package com.itheima.edu.info.manager.LambdaDemo2;

public class LambdaDemo2 {
    public static void main(String[] args) {
        useCal((a,b)->a+b);

    }
    public static void useCal(Calculator calculator){
        int a=calculator.cal(3,4  );
        System.out.println(a);
    }
}

interface Calculator{
    int cal(int a,int b);
}
