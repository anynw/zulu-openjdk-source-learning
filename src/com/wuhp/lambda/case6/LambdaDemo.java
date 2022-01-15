package com.wuhp.lambda.case6;

/**
 * 匿名内部类和 Lambda 表达式区别
 * 1、所需类型不同：lambda使用条件必须是接口，匿名内部类
 * 2、使用闲置不同：接口中存在多个抽象方法时，匿名内部类是可以调用的，但是 lambda 不可以
 * 3、实现原理不同：匿名内部类编译之后，产生一个单独的 .class 字节码文件，lambda编译之后，没有产生，对应的字节码文件在运行时候动态生成
 *
 * @author wuhp
 * @date 2022/1/16
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类方式
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("抽象方法");
            }
        });

        useStudent(new Student() {
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });

        // lambda 表达式
        useInter(() -> System.out.println("11"));
        //Target type of a lambda conversion must be an interface
        // useAnimal(() -> System.out.println("22"));
        //Target type of a lambda conversion must be an interface
        // useStudent(() -> System.out.println("33"));
    }


    private static void useStudent(Student s) {
        s.study();
    }

    private static void useAnimal(Animal a) {
        a.method();
    }

    private static void useInter(Inter it) {
        it.show();
    }
}
