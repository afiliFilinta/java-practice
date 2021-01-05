package com.papaya.java8;

import java.util.Objects;

@java.lang.FunctionalInterface
public interface FuncInterface {
    void oneAbstractMethod();

    default void defaultMethod(String str){
        Objects.nonNull(str);
        System.out.println(str);
    }
}
