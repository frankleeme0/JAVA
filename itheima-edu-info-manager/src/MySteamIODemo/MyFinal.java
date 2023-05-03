package MySteamIODemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyFinal {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"));
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        long count = list.stream().count();
    }
}
