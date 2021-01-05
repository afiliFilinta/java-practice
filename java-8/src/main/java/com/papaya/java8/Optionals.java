package com.papaya.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Optionals {


    public static <T> Optional<T> optionalTest(T test) {
        return Optional.ofNullable(test);
    }

    public static void main(String[] args) {

        //        Optional.of(test);
        //      Optional.empty();
        //    Optional.ofNullable(x);

        List<String> list = new ArrayList<>();
        list.add("muzaffer");
        //list.add(null);

        list.forEach(l -> optionalTest(l).ifPresent(System.out::println));

        List<List<String>> matrix = new ArrayList<>();

        matrix.add(list);
        matrix.add(list);
        matrix.add(list);


        List<String> x = matrix.stream().flatMap(a -> a.stream().map(String::toString)).collect(Collectors.toList());
        System.out.println(x);
    }
}
