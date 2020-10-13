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
   /* public static Job of(String name, Job job){
         Job job1 = new Job() {
            @Override
            public String getResponsibilities() {
                return super.getResponsibilities();
            }
        };
    }*/

    public static void main(String[] args) {
        Job job = new Plumber(); //dlaczego musimy utworzyc konsrtuktor po klasie dziedziczacej
        //System.out.println(job.responsibilities);

        Person person = new Person("Ted",33,job); // i dopiero wtedy mozemy utworzyc obiekt nowje klasy
        System.out.println(person.job.getSalary()); // i przypisac do zmiennej job metody z poprzedniej klasy
        System.out.println(person.job.responsibilities); // a nawet do zmiennej job przypisac zadelklarowana zmienna responisibilities
        }

}
