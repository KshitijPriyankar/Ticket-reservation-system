package com.ticket.model;

public class Passenger {
    private int id;
    private String name;
    private int age;

    public Passenger(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
}