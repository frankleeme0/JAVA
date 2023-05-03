package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao implements BaseStudentDao{
  private static Student[] stus=new Student[5];
  static {
    Student stu1=new Student("itheima001","张三","23","1999-11-11");
    Student stu2=new Student("itheima001","张三","23","1999-11-11");

    stus[0]=stu1;
    stus[1]=stu2;
  }
  public boolean addStudent(Student stu) {

     int index=-1;
    for (int i = 0; i < stus.length; i++) {
      Student student=stus[i];
      if(student==null){
        index=i ;
        break;
      }

    }

    if (index == -1) {
      return false;


    }else{
      stus[index]=stu;
      return true;
    }


  }

  public Student[] findAllStudent() {
    return  stus;
  }

  public void deleteStudentById(String delId) {
    //查找索引并用null覆盖
    int index = getIndex(delId);
    stus[index]=null;

  }
  public  int getIndex(String id){

    int index=-1;
    for (int i = 0; i < stus.length; i++) {
      Student stu=stus[i];
      if(stu!=null && stu.getId().equals(id)){
        index=i;
        break;
      }
    }
    return index;
  }

  public void updateStudent(String updateId, Student newStu) {
    //查找updateId对应索引，并替换
    int index = getIndex(updateId);
    stus[index]=newStu;

  }
}
