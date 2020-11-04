package com.kodilla.collections.adv.immutable.homework;

public class TaskExample {
    public static void main(String[] args) {
        Task task1 = new TaskHacked("Bieganie", 120);
        TaskHacked taskH = (TaskHacked) task1;
        taskH.modifyDuration(443);

        System.out.println(task1.getDuration());
        System.out.println(taskH.getDuration());

    }
}
