package MyPropertyDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class MyDemo3 {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        prop.put("zhangsan","16");
        prop.put("lisi","16");
        prop.put("wangwu","16");
        FileWriter fw=new FileWriter("c.properties");
        prop.store(fw,null);
        fw.close();

    }
}
