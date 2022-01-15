package com.wuhp.lambda.case2;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class EatableImpl implements Eatable {
    @Override
    public void eat() {
        System.out.println("重写了方法");
    }
}
