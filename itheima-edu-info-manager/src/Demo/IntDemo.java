package Demo;

public class IntDemo {
    public static void main(String[] args) {
//        Integer i = 100;
        String s="91 27 46 38 50";

//        System.out.println(i+Integer.parseInt(s));
        String[] ss=s.split(" ");
        Integer[] ii=new Integer[ss.length];

        for (int i1 = 0; i1 < ss.length; i1++) {
            int i2 = Integer.parseInt(ss[i1]);
            ii[i1]=i2;
            System.out.println(ii[i1]);

        }



    }
}
