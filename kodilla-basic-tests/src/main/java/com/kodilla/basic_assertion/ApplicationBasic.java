package com.kodilla.basic_assertion;

public class ApplicationBasic {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int substractResult = calculator.subtract(a, b);
        boolean correct2 = ResultChecker.assertSubstractEquals(-13, substractResult);
        if (correct2) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int squareResult = calculator.square(a);
        boolean correct3 = ResultChecker.assertSquaretEquals(25, squareResult);
        if (correct3) {
            System.out.println("Metoda kwadrat działa poprawnie dla liczby " + a );
        } else {
            System.out.println("Metoda kwadrat nie działa poprawnie dla liczby " + a );
        }
    }
}
