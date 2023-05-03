package CollectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        //如果要添加的键是存在的，会覆盖原先的值，并将原先的值返回
        map.put("zhangsan","xiaozhi");
        map.put("lisi","xiaomei");
        map.put("wangwu","xiaoli");

        //method1(map);
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            String value = map.get(key);
//            System.out.println(key+"--"+value);
//        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String s = entry.getKey() + "--" + entry.getValue();
            System.out.println(s);
        }

    }

    private static void method1(Map<String, String> map) {
        boolean b = map.containsKey("zhangsan");
        boolean b1 = map.containsValue("xiaomei");
    }
}
