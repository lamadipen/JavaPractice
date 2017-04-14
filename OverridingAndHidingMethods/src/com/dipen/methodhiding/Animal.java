package com.dipen.methodhiding;

/**
 * Created by dipen on 4/5/2017.
 */
public class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

    private void testInstanceMethodPrivate() {
        System.out.println("The instance method in Animal");
    }
}