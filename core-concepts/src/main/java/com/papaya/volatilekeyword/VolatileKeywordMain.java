package com.papaya.volatilekeyword;

public class VolatileKeywordMain {

    public static void main(String[] args) {

        //Thread that do not cache value of this variable and always read it from main memory

        VolatileVariable v1 = new VolatileVariable();
        VolatileVariable v2 = new VolatileVariable();

        v1.method1();
        v2.method2();
        /*
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("THREAD-1 is running");
                int i = 0;
                while (i < 10000) {
                    VolatileVariable.method1();
                    i++;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("THREAD-2 is running");
                int i = 0;
                while (i < 1000) {
                    VolatileVariable.method2();
                    i++;
                }

            }
        });

        thread1.start();
        thread2.start();

         */
    }

}
