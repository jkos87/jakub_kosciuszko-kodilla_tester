package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.giveVoice();
        //System.out.println(dog.getNumberOfLegs());

        Duck duck = new Duck(21);
        duck.giveVoice();
        duck.getNumberOfLegs();
        duck.numofEyes();
        if (duck.numofEyes < duck.getNumberOfLegs()) {
            System.out.println("Kacze Oczko");
        }
        else {
            duck.giveVoice();
        }
    }
}
