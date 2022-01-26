package com.wuhp.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射获取成员方法并使用
 *
 * @author wuhp
 * @date 2022/1/26
 */
public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> c = Class.forName("com.wuhp.reflect.Student");

        //所有的成员方法
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        //对象
        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        Method method1 = c.getMethod("method1");
        System.out.println(method1);

        method1.invoke(obj);


    }
}
