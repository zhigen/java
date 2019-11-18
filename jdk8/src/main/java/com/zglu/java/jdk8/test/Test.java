package com.zglu.java.jdk8.test;

import lombok.extern.log4j.Log4j2;

/**
 * 测试接口默认方法，及指定接口实现类
 *
 * @author zglu
 */
@Log4j2
public class Test {
    public static void main(String[] args) {
        TestService test1 = new TestServiceV1Impl();
        log.info(test1.test());
        log.info(test1.test());
        TestService test2 = new TestServiceV2Impl();
        log.info(test2.test());
    }
}