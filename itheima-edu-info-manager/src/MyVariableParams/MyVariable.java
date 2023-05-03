package MyVariableParams;

import java.util.List;
import java.util.Map;

public class MyVariable {
    public static void main(String[] args) {
        int getsum = getsum(1, 2, 3, 4, 5);
        System.out.println(getsum);

        List<String> a = List.of("a", "b", "c", "d");

        System.out.println(a);

        Map.ofEntries(Map.entry("zhangsan","江苏"));

        for (String arg : args) {
            System.out.println(arg);
        }

//        System.out.println(args);
    }

    private static int getsum(int...arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sum;
    }
}
