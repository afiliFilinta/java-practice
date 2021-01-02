package com.papaya.volatilekeyword;

public class VolatileVariable {

    // public static int a = 0;
    // public static int b = 0;

     volatile int a = 0, b = 0;

      public void method1() {
        a++;
        b++;
    }
      public void method2() {
        System.out.println("a= " + a + ", b= " + b);
    }
}
