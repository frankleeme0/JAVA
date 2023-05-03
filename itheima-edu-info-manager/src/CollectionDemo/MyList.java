package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");


        list.add(0,"qqq");
        //method(list);
        System.out.println(list.get(1 ));


    }

    private static void method(List<String> list) {
        boolean a = list.remove("aaa");
        String r = list.remove(1);
    }
}
