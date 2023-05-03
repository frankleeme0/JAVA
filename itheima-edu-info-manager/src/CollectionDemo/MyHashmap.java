package CollectionDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashmap {
    public static void main(String[] args) {
        HashMap<Student,String> hm=new HashMap<>();

        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",22);
        Student s3=new Student("wangwu",22);

        hm.put(s1,"江苏" );
        hm.put(s2,"北京" );
        hm.put(s3,"天津" );

//        Set<Student> keys = hm.keySet();
//        for (Student key : keys) {
//            String s = hm.get(key);
//            System.out.println(key+"---"+s);
//        }

//        Set<Map.Entry<Student, String>> entries = hm.entrySet();
//        for (Map.Entry<Student, String> entry : entries) {
//            System.out.println(entry.getKey()+"---"+entry.getValue());
//        }

        hm.forEach((Student key,String value)->{System.out.println(key+"---"+value);});



    }
}
