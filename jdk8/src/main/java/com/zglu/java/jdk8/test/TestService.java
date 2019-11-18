package com.zglu.java.jdk8.test;

/**
 * 接口
 *
 * @author zglu
 */
public interface TestService {

    /**
     * 接口默认方法
     *
     * @return 字符窜
     */
    default String test() {
        return "test";
    }
}