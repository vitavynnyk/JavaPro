package com.hillel.vynnyk.homeworks.homework2.part3.figures;

import com.hillel.vynnyk.homeworks.homework2.part3.Area;

public class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = 3.14 * Math.pow(radius, 2);
        System.out.println("Circle area is " + area + " m" + '\u00B2');
        return area;
    }

}
