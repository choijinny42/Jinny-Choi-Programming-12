package com.jinnychoi.module1_1;

public class TwoDShape {
    public double width;
    public double height;

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {

    }

    public double getArea() {
        return height * width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
