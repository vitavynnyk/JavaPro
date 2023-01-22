package com.hillel.vynnyk.homeworks.homework2.part3.figures;

import com.hillel.vynnyk.homeworks.homework2.part3.Square;

public class Squaree extends Figures implements Square {
    public Squaree(String name, double a) {
        super(name, a);
    }


    @Override
    public double square() {
        double square = Math.pow(a, 2);
        System.out.println(name + " square is " + square + " m" + '\u00B2');
        return square;
    }
}
