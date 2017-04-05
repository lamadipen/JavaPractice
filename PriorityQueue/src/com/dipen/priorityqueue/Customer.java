package com.dipen.priorityqueue;

/**
 * Created by dipen on 4/5/2017.
 */
public class Customer {
    private int id;
    private String name;

    public Customer(int i, String n){
        this.id=i;
        this.name=n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
