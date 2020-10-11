package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    int a;
    int h;
    int c;
    int b;

    public Triangle(int a, int b, int c, int h){
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return 0.5 * a * h;

    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
