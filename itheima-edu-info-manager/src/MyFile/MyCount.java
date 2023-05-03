package MyFile;

import java.io.File;
import java.util.HashMap;



public class MyCount {
    public static void main(String[] args) {
        File file=new File("itheima-edu-info-manager");
        HashMap<String,Integer> hm=new HashMap<>();
        getCount(hm,file);

        hm.forEach((k,v)-> System.out.println(k+":"+v));


    }

    private static void getCount(HashMap<String,Integer> hm,File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){

                String name = file1.getName();
                String[] split = name.split("\\.");
                System.out.println(split);

                if(split.length==2){
                    String fileEndName = split[1];
                    if(hm.containsKey(fileEndName)){
                        Integer count = hm.get(fileEndName);
                        count++;
                        hm.put(fileEndName,count);
                    }else{
                        hm.put(fileEndName,1);
                    }

                }


            }else {
                getCount(hm,file1);
            }
        }




    }
}
