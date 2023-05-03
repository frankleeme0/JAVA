package CollectionDemo;

import java.util.TreeMap;

public class MyTreemap {
    public static void main(String[] args) {
        TreeMap<Student,String> tm=new TreeMap<>();

        Student s1=new Student("张三",19);
        Student s2=new Student("李四",20);
        Student s3=new Student("王五",21);
        Student s4=new Student("王五",20);

        tm.put(s1,"北京");
        tm.put(s2,"江苏");
        tm.put(s3,"上海");
        tm.put(s4,"广州");

        tm.forEach((Student key,String value)->{
            System.out.println(key+"---"+value);
        });

    }
}
