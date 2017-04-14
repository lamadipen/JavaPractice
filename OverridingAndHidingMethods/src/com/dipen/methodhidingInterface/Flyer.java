package com.dipen.methodhidingInterface;

/**
 * Created by dipen on 4/5/2017.
 */
public interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
