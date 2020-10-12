package com.kodilla.abstracts.homework;

public class Person {
    private String  name;
    private int age;
    private Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }



    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        System.out.println(doctor.getResponsibilities());

        Nurse n1 = new Nurse();
        System.out.println(n1.getResponsibilities());
       // Doctor p1 = new Person("Max", 22,"dd");

        }

}
