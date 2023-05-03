package MySteamIODemo;

import java.util.ArrayList;

public class MyStream1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.stream().filter(s->{
            return s%2==0;
        }).forEach(s-> System.out.println(s));
    }
}
