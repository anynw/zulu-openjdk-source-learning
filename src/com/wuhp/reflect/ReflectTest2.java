package com.wuhp.reflect;

import sun.awt.windows.ThemeReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Struct;
import java.util.Properties;

/**
 * @author wuhp
 * @date 2022/1/26
 */
public class ReflectTest2 {

    private static final String PATH_TEACHER = "src/class-teacher.txt";
    private static final String PATH_STUDENT = "src/class-student.txt";

    public static void main(String[] args) throws Exception {
        //通过加载配置文件调用不通的方法
        Properties properties = new Properties();
        FileReader fileReader = new FileReader(PATH_TEACHER);
        properties.load(fileReader);
        fileReader.close();

        String className = (String) properties.get("className");
        String methodName = (String) properties.get("methodName");

        Class<?> aClass = Class.forName(className);
        Object obj = aClass.newInstance();

        Method method = aClass.getMethod(methodName);
        method.invoke(obj);


    }
}
