package com.jinnychoi;

import com.jinnychoi.module1_2.Circle;
import com.jinnychoi.module1_2.Triangle;
import com.jinnychoi.module1_2.TwoDShape;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3.5);
        Circle b = new Circle(5);
        Triangle z = new Triangle(5, 10);
        Triangle x = new Triangle(12,4,12);

        ArrayList<TwoDShape> shapes = new ArrayList<>();
        shapes.add(c);
        shapes.add(b);
        shapes.add(z);
        shapes.add(x);

        for(int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).toString());
            System.out.println(shapes.get(i).getArea());
        }
    }
}
