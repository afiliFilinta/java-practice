package com.papaya.java8;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Optional;

public class Lambda {

    public static void createThread() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run thread 1");
            }
        }).start();

        new Thread(() ->
                System.out.println("run thread 2")
        ).start();

    }


    public static void main(String[] args) {

        // 1: Using lambda expression to create and start a Thread in Java
        createThread();

        // 2: Using lambda expression to iterate over a List and perform some action on list elements
        String [] array = {"a","b","c"};

        Arrays.stream(array).forEach(System.out::print);
        System.out.println("\n***********");
        Arrays.stream(array).forEach(e -> System.out.print(e));
    }
}
