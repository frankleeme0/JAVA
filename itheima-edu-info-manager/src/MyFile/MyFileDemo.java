package MyFile;

import java.io.File;
import java.io.IOException;

public class MyFileDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("itheima-edu-info-manager\\aaa");
        if(!file.exists()){
            file.mkdirs();

        }
        File newfile=new File(file,"aaa.txt");
        newfile.createNewFile();
        //删除带文件和文件夹的文件夹
        File file1=new File("");
        deleteDir(file1);

    }



    public static void deleteDir(File file1) {
        File[] files = file1.listFiles();

        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else {
                deleteDir(file);
            }
        }

    }
}
