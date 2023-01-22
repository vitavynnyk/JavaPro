package com.hillel.vynnyk.homeworks.homework2;

import com.hillel.vynnyk.homeworks.homework2.part1.Car;
import com.hillel.vynnyk.homeworks.homework2.part2.Cat;
import com.hillel.vynnyk.homeworks.homework2.part2.Dog;
import com.hillel.vynnyk.homeworks.homework2.part3.figures.Circle;
import com.hillel.vynnyk.homeworks.homework2.part3.figures.Figures;
import com.hillel.vynnyk.homeworks.homework2.part3.figures.Squaree;
import com.hillel.vynnyk.homeworks.homework2.part3.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        System.out.println();

        Dog dog1 = new Dog("Barsik");
        dog1.run(100);
        dog1.swim(205);
        System.out.println();

        Cat cat1 = new Cat("Tom");
        cat1.run(205);
        cat1.swim(0);
        System.out.println();

        double[] figures = new double[]{
                new Triangle("Triangle", 5, 3).square(),
                new Circle("Circle", 4).square(),
                new Squaree("Square", 4).square(),
                new Circle("Circle2",4).square()
        };

        double sum = 0;
        for (double figure : figures) {
            sum += figure;
        }
        String formattedSum = String.format("%.2f", sum);
        System.out.println("Total sum: " + formattedSum +  " m" + '\u00B2' );

    }


}
