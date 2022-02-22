package com.jinnychoi.module1_2;


public class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.width = side2;
        this.side3 = side3;
        this.height = heronsHeight();
    }

    private double heronsHeight() {
        double s = (side1 + width + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - width) * (s - side3));
        return 2 * (area / width);

    }

    public double getArea() {
        return (width * height) / 2;
    }
}
