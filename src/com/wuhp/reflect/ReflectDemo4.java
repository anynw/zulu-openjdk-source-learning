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
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> c = Class.forName("com.wuhp.reflect.Student");

        //公共字段
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //所有成员变量
        Field[] declaredFields = c.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field address = c.getDeclaredField("address");
        System.out.println("address = " + address);

        Constructor<?> constructor = c.getConstructor();
        Object o = constructor.newInstance();
        System.out.println(o);

        address.set(o,"北京");
        System.out.println(o);

    }
}
