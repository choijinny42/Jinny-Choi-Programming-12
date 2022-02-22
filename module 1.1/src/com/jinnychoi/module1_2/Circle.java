package com.jinnychoi.module1_2;

public class Circle extends TwoDShape {
    public final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
