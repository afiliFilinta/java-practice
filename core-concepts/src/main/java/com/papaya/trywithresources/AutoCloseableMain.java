package com.papaya.trywithresources;

public class AutoCloseableMain {

    public static void main(String[] args) {

        try(AutoCloseableClass object = new AutoCloseableClass()){
            System.out.println("Try with resources");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
