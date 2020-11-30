package com.kodilla.stream;

public class UsersManager {

        public static void main (String[]args){
            UsersRepository.getUsersList()
                    .stream()
                    .map(u -> u.getAge())
                    .map(z -> z.getClass())
                    .forEach(un -> System.out.println(un));
        }
    }
