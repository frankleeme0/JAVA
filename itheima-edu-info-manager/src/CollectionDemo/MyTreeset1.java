package CollectionDemo;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeset1 {
    public static void main(String[] args) {
        TreeSet<Teachcer> ts = new TreeSet<>(
//                new Comparator<Teachcer>() {
//                    @Override
//                    public int compare(Teachcer o1, Teachcer o2) {
//                        //o1要存入
//                        return o1.getAge()-o2.getAge()==0?o1.getName().compareTo(o2.getName()):o1.getAge()-o2.getAge();
//                    }
//                }
                ((o1, o2) -> o1.getAge() - o2.getAge() == 0 ? o1.getName().compareTo(o2.getName()) : o1.getAge() - o2.getAge())

        );

        Teachcer t1 = new Teachcer("zhangsan", 21);
        Teachcer t2 = new Teachcer("lisi", 22);
        Teachcer t3 = new Teachcer("wangwu", 23);
        Teachcer t4 = new Teachcer("zhaoliu", 22);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);

        System.out.println(ts);


    }
}
