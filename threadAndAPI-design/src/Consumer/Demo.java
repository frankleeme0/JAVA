package Consumer;

public class Demo {
    public static void main(String[] args) {
        Foodie f=new Foodie();
        Cookie c=new Cookie();

        f.start();
        c.start();
    }
}
