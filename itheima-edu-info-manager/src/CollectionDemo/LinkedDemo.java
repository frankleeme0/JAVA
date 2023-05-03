package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>()  ;
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        Iterator<String> iterator = list.iterator();
        list.addFirst("000");
        list.removeFirst();

        for (String s : list) {
            System.out.println(s);
        }
    }
}
