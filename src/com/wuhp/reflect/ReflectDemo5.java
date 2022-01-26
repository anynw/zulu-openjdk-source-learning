package com.wuhp.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射获取成员变量并使用
 *
 * @author wuhp
 * @date 2022/1/26
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> c = Class.forName("com.wuhp.reflect.Student");
        Constructor<?> constructor = c.getConstructor();
        Object obj = constructor.newInstance();

        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj, "zhangsan");
        System.out.println(obj);

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 18);
        System.out.println(obj);

        Field addressField = c.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(obj, "北京");
        System.out.println(obj);
    }
}
