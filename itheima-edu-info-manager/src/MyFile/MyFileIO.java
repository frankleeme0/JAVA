package MyFile;

import java.io.File;
import java.io.IOException;

public class MyFileIO {
    public static void main(String[] args) throws IOException {

//        method();
        File file=new File("d:\\");
        File[] files=file.listFiles();
        //当调用者为文件或有权限的文件夹，返回null
        
        for (File file1 : files) {
            System.out.println(file1);
        }

    }

    private static void method() throws IOException {
        File file=new File("c:\\itheima");

        String path="a.txt";

        File file1=new File(file,path);
        File file2=new File("a.txt");
        file2.createNewFile();
        file2.delete();
        boolean result = file2.isFile();
        boolean result2 = file2.isDirectory();
        boolean result3 = file2.exists();
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
