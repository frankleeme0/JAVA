package MySteamIODemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyTolist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> list1 = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(list1 );
    }
}
