package com.hillel.vynnyk.homeworks.homework2.part3.figures;

import com.hillel.vynnyk.homeworks.homework2.part3.Square;

public class Triangle extends Figures implements Square {
    public Triangle(String name, double height, double a) {
        super(name, height, a);
    }

    @Override
    public double square() {
        double square = 0.5 * a * height;
        System.out.println( name + " square is " + square + " m" + '\u00B2');
        return square;
    }
}
