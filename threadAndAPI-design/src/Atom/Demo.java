package Atom;

public class Demo {
    public static void main(String[] args) {
        MyAtomThread myAtomThread=new MyAtomThread();
        Thread th=new Thread(()->{

        });
        for (int i = 0; i < 100; i++) {
            new Thread(myAtomThread).start();
        }
    }
}
