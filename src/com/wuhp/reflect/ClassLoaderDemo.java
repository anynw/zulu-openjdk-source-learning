package com.wuhp.reflect;

/**
 * @author wuhp
 * @date 2022/1/26
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println("parent = " + parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println("parent1 = " + parent1);

    }
}
