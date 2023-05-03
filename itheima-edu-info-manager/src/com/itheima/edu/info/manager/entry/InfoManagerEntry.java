package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //搭建主菜单
    while (true){
      System.out.println("--------欢迎来到黑马信息管理系统--------");
      System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
      String choice = sc.next();
      switch (choice) {
        case "1":
          //System.out.println("学生管理");
          //开启学生管理系统
          StudentController studentController=new StudentController();
          studentController.start();
          break;
        case "2":
          System.out.println("老师管理");
          break;
        case "3":
          System.out.println("感谢您的使用");
          //关闭正在运行的虚拟机
          System.exit(0);
          break;
        default:
          System.out.println("您的输入有误，请重新输入");
          break;
      }
    }



  }
}
