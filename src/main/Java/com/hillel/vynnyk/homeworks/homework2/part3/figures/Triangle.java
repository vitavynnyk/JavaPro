package com.hillel.vynnyk.homeworks.homework2.part3.figures;

import com.hillel.vynnyk.homeworks.homework2.part3.Area;

public class Triangle  implements Area {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        double area = 0.5 * base * height;
        System.out.println("Triangle area is " + area + " m" + '\u00B2');
        return area;
    }
}
