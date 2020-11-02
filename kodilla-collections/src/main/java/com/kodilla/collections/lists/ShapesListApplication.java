package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        Square sq1 = new Square(10);
        Square sq2 = new Square(5);
        shapes.add((new Square(1)));
        shapes.add(sq1);
        shapes.add(sq2);

        for (int n = 0; n<shapes.size(); n++) {
            Square square = shapes.get(n);
            if (20 > square.getArea())
                System.out.println(square + ", area: " + square.getArea());
        }
        for ( Square square : shapes){
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
    }
}
