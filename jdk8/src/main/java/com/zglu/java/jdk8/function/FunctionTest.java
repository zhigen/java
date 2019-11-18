package com.zglu.java.jdk8.function;

import lombok.extern.log4j.Log4j2;

import java.util.function.*;

/**
 * 测试java8特性function包下接口
 *
 * @author zglu
 */
@Log4j2
public class FunctionTest {

    /**
     * T：入参类型，R：出参类型
     */
    private static Function<Boolean, String> func = p -> (p != null && p) ? "1" : "0";
    private static IntUnaryOperator iuo = p -> p * 10;
    /**
     * T：入参类型，没有出参
     */
    private static Consumer<String> consumer = log::info;
    /**
     * T：出参类型，没有入参
     */
    private static Supplier<String> supplier = () -> "100";
    private static IntSupplier is = () -> 100;
    /**
     * T：入参类型，出参类型是boolean
     */
    private static Predicate<String> predicate = p -> Integer.parseInt(p) == 100;
    private static IntPredicate ip = p -> p == 100;


    public static void main(String[] args) {
        log.info(func.apply(true));
        log.info(iuo.applyAsInt(10));
        consumer.accept("100");
        log.info(supplier.get());
        log.info(is.getAsInt());
        log.info(predicate.test("100"));
        log.info(ip.test(100));
    }
}