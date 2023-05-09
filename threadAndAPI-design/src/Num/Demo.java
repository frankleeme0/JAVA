package Num;

public class Demo {
    public static void main(String[] args) {
//        System.out.println(Season.AUTUMN);
//
//        Season spring = Season.SPRING;
        String name = Season.SPRING.name();

        int ordinal = Season.AUTUMN.ordinal();

        int i = Season.WINTER.compareTo(Season.SUMMER);

        String string = Season.WINTER.toString();

        Season spring = Enum.valueOf(Season.class, "SPRING");

        Season[] values = Season.values();


    }
}
