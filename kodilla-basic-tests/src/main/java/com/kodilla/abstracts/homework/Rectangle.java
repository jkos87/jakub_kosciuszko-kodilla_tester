package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    int a;
    int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*a+2*b;
    }
}
