package com.dipen.methodhidingInterface;

/**
 * Created by dipen on 4/5/2017.
 */
public interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
