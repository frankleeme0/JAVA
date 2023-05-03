package MyObjectStream;

import java.io.*;

public class MyObjectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user=new User("zhangsan","pswd");
        ObjectOutputStream ois=new ObjectOutputStream(new FileOutputStream("itheima-edu-info-manager\\src\\MyObjectStream\\a.txt"));
        //或者用容器储存
        ois.writeObject(user);
        ois.close();

        ObjectInputStream oiss=new ObjectInputStream(new FileInputStream("itheima-edu-info-manager\\src\\MyObjectStream\\a.txt"));
        User o = null;
        while (true){
            try {
                o = (User)oiss.readObject();
            } catch (EOFException e) {
                break;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(o);
        oiss.close();


    }
}
