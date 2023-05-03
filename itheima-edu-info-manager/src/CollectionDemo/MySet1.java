package CollectionDemo;

import java.util.Set;
import java.util.TreeSet;

public class MySet1 {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        for (String s : set) {
            System.out.println(s);
        }

    }
}
