package com.zglu.java.jdk8.test;

/**
 * 测试接口默认方法
 */
public class Test {
    public static void main(String[] args) {
        InterfaceTest test = new ImplTest();
        System.out.println(test.test());
    }
}
