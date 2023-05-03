package MyPropertyDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MyDemo2 {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        FileReader fr=new FileReader("prop.properties");
        prop.load(fr);
        fr.close();
        System.out.println(prop);


    }
}
