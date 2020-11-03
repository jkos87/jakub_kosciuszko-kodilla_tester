package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();
        Student jhon = new Student("Jhon", "Stevson");
        Student jessie = new Student("Jessie", "Pinkman");
        Student bart = new Student("Bart", "Simpson");

        Grades johnGrades = new Grades(5.0, 4.0, 4.5, 5.0, 5.0);
        Grades jessieGrades = new Grades(2.5, 3.0, 2.0);
        Grades bartGrades = new Grades(4.0, 4.0, 4.0, 4.0, 5.0);

        school.put(jhon, johnGrades);
        school.put(jessie, jessieGrades);
        school.put(bart, bartGrades);

        System.out.println(school.get(jhon));
        System.out.println(school.get(johnGrades));

        for (Map.Entry<Student, Grades> studentEntry : school.entrySet())
            System.out.println(studentEntry.getKey().getFirstName()+ "Average: " + studentEntry.getValue().getAverage());
    }
}
