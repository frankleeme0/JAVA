package Anno2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnoDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("Anno2.UseTest");

        UseTest useTest =(UseTest) aClass.newInstance();
        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            if(declaredMethod.isAnnotationPresent(Test.class)){
                declaredMethod.invoke(useTest);
            }
        }
    }
}
