package com.papaya.trywithresources;


public class AutoCloseableClass implements AutoCloseable {

    public AutoCloseableClass(){
        System.out.println("AutoCloseableClass constructor is called");
    }
    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseableClass is closed");
    }
}
