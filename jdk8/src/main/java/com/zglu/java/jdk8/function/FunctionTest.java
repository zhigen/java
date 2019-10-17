package com.zglu.java.jdk8.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 测试function接口
 */
public class FunctionTest {

    //T：入参类型，R：出参类型
    private static Function<Integer, Integer> func = p -> p * 10;
    //T：入参类型，没有出参
    private static Consumer<String> consumer = System.out::println;
    //T：出参类型，没有入参
    private static Supplier<Integer> supplier = () -> 100;
    //T：入参类型，出参类型是boolean
    private static Predicate<Integer> predicate = p -> p == 100;

    public static void main(String[] args) {
        System.out.println(func.apply(10));
        consumer.accept("100");
        System.out.println(supplier.get());
        System.out.println(predicate.test(100));
    }
}
