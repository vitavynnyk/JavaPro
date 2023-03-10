package com.hillel.vynnyk.homeworks.homework2.part2;

public abstract class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
