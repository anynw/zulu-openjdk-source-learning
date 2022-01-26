package com.wuhp.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射获取类的构造方法
 * @author wuhp
 * @date 2022/1/26
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.wuhp.reflect.Student");
        Constructor<?>[] constructors = c.getConstructors();
        System.out.println("默认或者公共的构造方法");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("所有的构造方法");
        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        System.out.println("反射：获取单个构造方法");
        Constructor<?> constructor = c.getConstructor();
        Object o = constructor.newInstance();
        System.out.println(o);


    }
}
