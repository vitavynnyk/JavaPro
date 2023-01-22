package com.hillel.vynnyk.homeworks.homework2.part3.figures;

import com.hillel.vynnyk.homeworks.homework2.part3.Square;

public class Circle extends Figures implements Square {
    public Circle(String name, double a) {
        super(name, a);
    }

    @Override
    public double square() {
        double square = 3.14 * Math.pow(a,2);
        System.out.println(name + " square is " + square + " m" + '\u00B2');
        return square;
    }

}
