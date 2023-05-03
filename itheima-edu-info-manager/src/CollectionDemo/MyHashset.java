package CollectionDemo;

import java.util.HashSet;

public class MyHashset {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();

        hs.add("Java");
        hs.add("Hello");
        hs.add("World");
        hs.add("zhangsan");
        hs.add("lisi");
        hs.add("wangwu");


        System.out.println(hs);
    }
}
