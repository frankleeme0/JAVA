package Annotation;

@interface Anno1 {
   int a () default 23;
   String name() default "itheima";

   Class clazz() default Anno2.class;

   int[] arr() default {1,2,3};

   String value();





}
