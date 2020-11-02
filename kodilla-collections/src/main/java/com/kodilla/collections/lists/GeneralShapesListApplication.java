package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Square(10));
        shapes.add(new Circle(7));
        shapes.add(new Triangle(10,4,10.77));

        shapes.remove(1);
        System.out.println(shapes.size());

        for (Shape shape : shapes){
            System.out.println(shape +", area: " + shape.getArea() + " Perimeter " + shape.getPerimeter());
        }
    }
}
