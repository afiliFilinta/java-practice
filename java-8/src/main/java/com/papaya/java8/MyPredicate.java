package com.papaya.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyPredicate {

    public static Predicate<String> isNotEmpty() {
        return s -> s.length() > 0;
    }

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("test");
        list.add("");
        System.out.println(list.stream().filter(isNotEmpty()).collect(Collectors.toList()));

        // Convert Regex to Predicate
        Predicate<String> emailFilter = Pattern
                .compile("^(.+)@example.com$")
                .asPredicate();

        String.join("","Muzaffer","Karsli");
    }

}
