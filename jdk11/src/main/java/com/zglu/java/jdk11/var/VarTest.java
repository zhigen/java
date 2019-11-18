package com.zglu.java.jdk11.var;

import lombok.extern.java.Log;

/**
 * 测试java11的var关键定
 *
 * @author zglu
 */
@Log
public class VarTest {
    public static void main(String[] args) {
        var a = 1;
        log.info(a + "");
    }
}