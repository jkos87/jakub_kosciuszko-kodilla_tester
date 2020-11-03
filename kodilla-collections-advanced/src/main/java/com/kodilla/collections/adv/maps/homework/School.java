package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Double> students = new ArrayList<>();

    public School (String schoolName, double ... students){
        this.schoolName = schoolName;
        for (double student : students)
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "School name: "+this.schoolName + ". School students =" + students.toString();
    }
}
