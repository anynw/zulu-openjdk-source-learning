package com.wuhp.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取共有构造方法
 * @author wuhp
 * @date 2022/1/26
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.wuhp.reflect.Student");
        // public Student(String name, int age, String address) {
        Constructor<?> constructor = c.getConstructor(String.class, int.class, String.class);
        System.out.println("constructor = " + constructor);

        // 反射获取公有构造方法
        // Object object = constructor.newInstance("zhangsan", 18, "北京");
        Student object = (Student)constructor.newInstance("zhangsan", 18, "北京");
        System.out.println(object);
    }
}
