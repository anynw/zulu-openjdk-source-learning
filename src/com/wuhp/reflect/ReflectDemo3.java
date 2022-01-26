package com.wuhp.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取私有构造方法：setAccessible(true)
 * @author wuhp
 * @date 2022/1/26
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.wuhp.reflect.Student");
        //private Student(String name) {
        Constructor<?> constructor = c.getDeclaredConstructor(String.class);
        System.out.println("constructor = " + constructor);
        //暴力反射，true 取消访问检查
        constructor.setAccessible(true);

        // 反射获取私有构造方法
        Student object = (Student) constructor.newInstance("zhangsan");
        System.out.println(object);
    }
}
