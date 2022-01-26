package com.wuhp.reflect;

/**
 * 获取类的字节码对象的三种方式
 * 1、通过类的class属性获取对应的class对象
 * 2、通过对象的 getClass 方法
 * 3、通过Class类中的静态方法 forName(String className)
 *
 * @author wuhp
 * @date 2022/1/26
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1、通过类的class属性获取对应的class对象
        Class<Student> c1 = Student.class;
        System.out.println("c1 = " + c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);

        //2、通过对象的 getClass 方法
        Student student = new Student();
        Class<? extends Student> c3 = student.getClass();
        System.out.println(c1 == c3);

        //3、通过Class类中的静态方法 forName(String className)
        Class<?> c4 = Class.forName("com.wuhp.reflect.Student");
        System.out.println(c1 == c4);



    }
}
