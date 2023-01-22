package com.hillel.vynnyk.homeworks.homework2.part3.figures;

import com.hillel.vynnyk.homeworks.homework2.part3.Area;

public class Square  implements Area {
    private  double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        double area = Math.pow(side, 2);
        System.out.println("Square area is " + area + " m" + '\u00B2');
        return area;
    }
}
