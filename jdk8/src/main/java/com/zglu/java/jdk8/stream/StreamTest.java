package com.zglu.java.jdk8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //整数流
        IntStream intStream = IntStream.range(1, 5);
        //整数流转换成对象流
        Stream<Vo> stream = intStream.mapToObj(Vo::new);
        //对象流转换成列表
        List<Vo> list = stream.collect(Collectors.toList());
        list.add(new Vo(1));
        System.out.println("遍历列表：");
        list.forEach(System.out::print);
        System.out.println("\n筛选对象，返回新列表：");
        list = list.stream().filter(p1).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("修改对象");
        list = list.stream().peek(c1).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("排序列表");
        list = list.stream().sorted(cp1).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("对象去重");
        list = list.stream().filter(distinct(Vo::getId)).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("flatMap的使用");
        List<String> listString = list.stream().flatMap(m -> m.getList().stream()).collect(Collectors.toList());
        System.out.println(listString);
        System.out.println("获取第一个元素");
        Vo vo = list.stream().findFirst().orElse(null);
        System.out.println(vo);
    }

    private static Predicate<Vo> p1 = m -> m.getId() != 4;

    private static Consumer<Vo> c1 = m -> m.setName("name" + m.getName());

    private static Comparator<Vo> cp1 = Comparator.comparing(Vo::getValue).reversed();

    private static <T> Predicate<T> distinct(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return m -> map.putIfAbsent(keyExtractor.apply(m), Boolean.TRUE) == null;
    }
}
