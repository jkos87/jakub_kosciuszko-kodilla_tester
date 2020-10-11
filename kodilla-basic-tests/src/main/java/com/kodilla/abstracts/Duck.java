package com.kodilla.abstracts;

public class Duck extends Animal {
    int numofEyes;

    public Duck(int numofEyes) {
        super(2);
        this.numofEyes = numofEyes;
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }

    public void numofEyes() {
        System.out.println(numofEyes);
    }
}
