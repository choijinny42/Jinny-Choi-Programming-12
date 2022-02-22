package com.jinnychoi.module1_4;


public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double heronsHeight() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return 2 * (area / side2);

    }

    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public void rotate90() {
        
    }

    @Override
    public void rotate180() {

    }

    @Override
    public void rotate(double degree) {

    }
}
