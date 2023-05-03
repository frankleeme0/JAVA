package MyPropertyDemo;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyDemo {
    public static void main(String[] args) {
        Properties p=new Properties();
        p.put("zhangsan","23");
        p.put("李四","24");
        p.put("王五","25");



        System.out.println(p);
        //p.remove删除，修改也用put，查询用get
        Set<Object> keys = p.keySet();
        for (Object key : keys) {
            Object o = p.get(key);
            System.out.println(o);
        }

        Set<Map.Entry<Object, Object>> entries = p.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
