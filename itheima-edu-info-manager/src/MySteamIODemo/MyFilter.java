package MySteamIODemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyFilter {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"));
        ArrayList<String> list2=new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"));
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//
//                return s.startsWith("张");
//
//            }
//        }).forEach(s-> System.out.println(s));
//        method1(list);
//        method2(list);
//        method3(list, list2);
        //distinct去重
        list.stream().distinct().forEach(s -> System.out.println(s));


    }

    private static void method3(ArrayList<String> list, ArrayList<String> list2) {
        Stream<String>  stream1= list.stream();
        Stream<String>  stream2= list2.stream();
        Stream<String>  stream3=Stream.concat(stream1,stream2);
//        Stream.concat(list.stream(),list2.stream());
        stream3.forEach(s-> System.out.println(s));
    }

    private static void method2(ArrayList<String> list) {
        list.stream().filter(s->s.startsWith("张")).limit(2).skip(1).forEach(s -> System.out.println(s));
    }

    private static void method1(ArrayList<String> list) {
        list.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
    }
}
