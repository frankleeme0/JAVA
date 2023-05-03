package com.itheima.edu.info.manager.interdemo;

public class Test2Polymorpic {

  public static void main(String[] args) {
    Fu f=new Zi();
    f.method();
    Zi z=(Zi) f;
    z.call();
    //内部类
    Fu.Z z1=new Fu().new Z();
    System.out.println(z1.num);



  }
}
class Fu{
  int num=1;
  public void method(){

    class Er{
      public void show(){
        System.out.println("局部内部类");
      }
    }
    Er er=new Er();
    System.out.println("父类");

  }
  class Z{
    int num=1;
  }
}
class Zi extends Fu{
  int num=3;
  public void method(){
    System.out.println("子类");
    System.out.println(num);
    System.out.println(super.num);
  }
  public void call(){
    System.out.println("我是子类call");
  }
}