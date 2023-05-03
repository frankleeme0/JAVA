package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {
  private static ArrayList<Student> stus=new ArrayList<>();
  static {
    Student stu1=new Student("itheima001","张三","23","1999-11-11");
    Student stu2=new Student("itheima001","张三","23","1999-11-11");

    stus.add(stu1);
    stus.add(stu2);
  }
  @Override
  public boolean addStudent(Student stu) {

    stus.add(stu);
    return true;

  }

  public Student[] findAllStudent() {
    Student[] students=new Student[stus.size()];
    for (int i = 0; i < students.length; i++) {
      students[i]=stus.get(i);
    }

    return  students;
  }

  public void deleteStudentById(String delId) {
    //查找索引并用null覆盖
    int index = getIndex(delId);
    stus.remove(index);


  }
  public  int getIndex(String id){

    int index=-1;
    for (int i = 0; i < stus.size(); i++) {
      Student stu=stus.get(i);
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
    stus.set(index,newStu);

  }
}
