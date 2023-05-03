package MyIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyUsername {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名" );
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();


        FileWriter fw=new FileWriter("username.txt");

        fw.write(username);
        fw.write("\r\n");
        fw.write(password);
        fw.close();

    }
}
