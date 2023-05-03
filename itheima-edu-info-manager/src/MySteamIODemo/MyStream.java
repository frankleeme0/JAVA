package MySteamIODemo;

import java.util.*;
import java.util.stream.Stream;

public class MyStream{

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(List.of("张三丰","张无忌","张翠三","王二麻子"));

        ArrayList<String> list2=new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                list2.add(s);

            }
        }
//        list2.forEach(s -> System.out.println(s));
//        System.out.println(list2);
        Stream<String> stream=list.stream();
        stream.forEach(s->{
            System.out.println(s);
        });

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("zhangsan",23);
        hm.put("zhaosi",23);
        hm.put("wangwu",23);
        hm.put("zhaoliu",23);

//        hm.keySet().stream().forEach(s-> System.out.println(s));

        hm.entrySet().stream().forEach(s->{
            System.out.println(s);});

        int[] i={21,33,55};
        Arrays.stream(i).forEach(s-> System.out.println(s));


    }
}
