package com.papaya.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    // most of the stream operations return a stream.
    // This helps us to create a chain of stream operations. This is called as pipe-lining.
    // Intermediate Operations
    //  filter()
    //  map()
    //  flatMap()
    //  distinct()
    //  sorted()
    //  peek()
    //  limit()
    //  skip()


    public static void main(String[] args) {

        // Stream.of
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Stream.of(new Integer[]{1, 2, 3}).forEach(System.out::println);
        stream.forEach(s -> System.out.println(s));

        // Stream.generate
        System.out.printf("*********");
        Stream generater = Stream.generate(() -> new Random().nextInt(100));
        generater.limit(3).forEach(System.out::println);

        // List
        System.out.printf("*********");
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.stream().forEach(System.out::println);
        List<Integer> secondList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        Integer[] array = list.stream().filter(i -> i % 2 == 0).toArray(Integer[]::new);

        // Map, Sorted, Limit, Peek
        System.out.println("*********");
        Arrays.stream(array)
                .peek(System.out::println)
                .skip(2)
                .limit(3)
                .map(i -> i + 1)
                .sorted()
                .peek(System.out::println)
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .collect(Collectors.toList());

        // Peek: peek() exists mainly to support debugging, where we want to see the elements as they flow past a certain point in a pipeline.

        //sequential stream
        System.out.printf("*********");
        String x = Stream.of("one", "two", "three", "four")
                .filter(e -> e.startsWith("x"))
                .findFirst().orElse("Muzaffer");
        System.out.println(x);

        //parallel stream
        Stream.of("one", "two", "three", "four")
                .parallel()
                .findFirst()
                .ifPresent(System.out::println);

    }

}
