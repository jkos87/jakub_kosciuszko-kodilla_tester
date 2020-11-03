package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> director = new HashMap<>();
        Principal jhon = new Principal("Jhon Deer");
        Principal adam = new Principal("Adam Lee");
        Principal max = new Principal("Max Pain");

        School jhonSchool = new School("nr1", 125.0);
        School adamSchool = new School("nr34",1543);
        School maxSchool = new School("nr T", 321);


        director.put(jhon, jhonSchool);
        director.put(adam, adamSchool);
        director.put(max, maxSchool);

        System.out.println(director.get(jhonSchool));

        for (Map.Entry<Principal, School> studentEntry : director.entrySet())
            System.out.println("Director name: " + studentEntry.getKey().getDirectorName()+". "+ studentEntry.getValue().toString());
    }
}
