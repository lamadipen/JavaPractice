package com.dipen.methodhiding;

/**
 * Created by dipen on 4/5/2017.
 */
public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    private void testInstanceMethodPrivate() {
        System.out.println("The instance method in Animal");
    }
    /**
     *  the version of the hidden static method that gets invoked is the one in the superclass
     *  and the version of the overridden instance method that gets invoked is the one in the subclass.
     * @param args
     */
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        //error method hiding as method is private
        //myAnimal.testInstanceMethodPrivate();
        // it can be accessed only via Cat Instance
        myCat.testInstanceMethodPrivate();
    }
}