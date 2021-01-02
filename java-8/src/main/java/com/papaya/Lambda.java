package com.papaya;

import java.sql.SQLOutput;

public class Lambda {

    public void createThread() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run thread 1");
            }
        }).start();

        new Thread(() ->
                System.out.println("run thread 1")
        );

    }
}
