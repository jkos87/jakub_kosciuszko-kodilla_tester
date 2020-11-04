package com.kodilla.collections.adv.immutable.homework;

public class TaskHacked  extends Task{
    private int newDuration;

    public TaskHacked(String title, int duration) {
        super(title, duration);
        newDuration = duration;
    }

    public void modifyDuration (int duration1){
        newDuration = duration1;
    }

}
