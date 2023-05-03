package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MyCollection {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        ArrayList<Integer> int1=new ArrayList<>();
        int1.add(1);
        int1.add(2);

        System.out.println(int1);
        Collection<String> collections=new ArrayList<>();
        collections.add("aaa");
        collections.add("bbb");
        collections.add("ccc");
        collections.remove("ccc");
//        boolean rem = collections.remove("aaa");
//        boolean b = collections.removeIf(
//                (String s) -> {
//                    return s.length() == 3;
//                }
//        );
//        System.out.println(i.hasNext()  );
        for (int j=0;j<list1.size();j++) {
            String s=list1.get(j);
            if("b".equals(s)){
                list1.remove(j);
            }

        }
        System.out.println(list1);

        for(String s:list1){
            System.out.println(s);
        }

        Iterator<String> i=collections.iterator();

        while (i.hasNext()){
            String next = i.next();
            if("bbb".equals(next)){
                i.remove();
            }
        }
        System.out.println( collections);








    }



}
