package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public  static int getNumberofRounds () {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter the number of rounds");
            String s = scanner.next();
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            } catch (Exception e) {
                System.out.println("Wrong data. Enter again");
            }
        }
    }
}
