package com.jinnychoi.module1_4;

public abstract class TwoDShape {
    double width;
    double height;
    Colour colour;

    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public TwoDShape() {

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public abstract double getArea();

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "TwoDShape{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
