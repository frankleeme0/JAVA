package Demo;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入年龄");
            String s = sc.nextLine();
            int age=Integer.parseInt(s);
            System.out.println(age);
        } catch (NumberFormatException e) {
            System.out.println("异常执行了");
        }
    }
}
