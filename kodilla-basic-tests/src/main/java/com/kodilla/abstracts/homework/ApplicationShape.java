package com.kodilla.abstracts.homework;

public class ApplicationShape {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(2,2,2, 4);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        Square kaw = new Square(4);
        System.out.println(kaw.area());
        System.out.println(kaw.perimeter());

        Rectangle pros = new Rectangle(4,5);
        System.out.println(pros.area());
        System.out.println(pros.perimeter());
    }
}
