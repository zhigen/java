package com.zglu.java.jdk8.stream;

import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream.of(1,2).forEach(System.out::println);
    }
}
