package com.hillel.vynnyk.homeworks.homework2.part2;

public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void run(int obstacle) {
        if(obstacle<=500){
        System.out.println(name + " ran " + obstacle + " meters");}
        else {
            System.out.println(name + " can't run more then 500 meters");
        }
    }
    @Override
    public void swim(int obstacle) {
        if (obstacle<=10){
        System.out.println(name + " swam " + obstacle + " meters");
        }
        else {
            System.out.println(name + " can't swim more then 200 meters");
        }
    }
}
