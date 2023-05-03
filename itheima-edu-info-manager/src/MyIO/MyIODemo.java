package MyIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyIODemo {
    public static void main(String[] args)  {
        FileOutputStream fos=null;
        byte[] i={97,98,99};
        try {
            fos=new FileOutputStream("a.txt",true);
            fos.write(i, 1, 1);
            fos.write(97);
            fos.write("\r\n".getBytes());
            fos.write(97);
            fos.write("\r\n".getBytes());
            fos.write(97);


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fos !=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
