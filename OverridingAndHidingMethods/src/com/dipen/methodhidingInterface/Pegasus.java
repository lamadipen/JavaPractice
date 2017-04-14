package com.dipen.methodhidingInterface;

/**
 * Created by dipen on 4/5/2017.
 */
public class Pegasus extends Horse implements Mythical,Flyer {
    /** https://docs.oracle.com/javase/tutorial/java/IandI/override.html
     *  Instance methods are preferred over interface default methods
     *  output :The method Pegasus.identifyMyself returns the string I am a horse.
     *  **/
    public static void main(String [] args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }

}
