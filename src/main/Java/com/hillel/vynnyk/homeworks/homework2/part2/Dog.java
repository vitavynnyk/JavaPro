package com.hillel.vynnyk.homeworks.homework2.part2;

public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void run(int distance) {
        if(distance<=500){
        System.out.println(name + " ran " + distance + " meters");}
        else {
            System.out.println(name + " can't run more then 500 meters");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance<=10){
        System.out.println(name + " swam " + distance + " meters");
        }
        else {
            System.out.println(name + " can't swim more then 200 meters");
        }
    }
}
