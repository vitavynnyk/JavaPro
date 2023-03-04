package com.hillel.vynnyk.homeworks.homework2.part2;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if(distance<=200){
            System.out.println(name + " ran " + distance + " meters");
        }else {
            System.out.println(name + " can't run more then 200 meters");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim");
    }
}
