package com.hillel.vynnyk.homeworks.homework2.part2;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int obstacle) {
        System.out.println(name + " can't run more then 200 meters");
    }

    @Override
    public void swim(int obstacle) {
        System.out.println(name + " can't swim");
    }
}
