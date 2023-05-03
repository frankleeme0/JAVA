package CollectionDemo;

import java.util.TreeSet;

public class MyTreeset {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>() ;
        Student s1=new Student("张三",19);
        Student s2=new Student("李四",20);
        Student s3=new Student("王五",21);
        Student s4=new Student("王五",20);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);

    }
}
