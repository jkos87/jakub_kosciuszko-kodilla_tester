package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersLowerThen1.csv", delimiter = ',')
    public void shouldExepctionWhenZeroandNegative(Integer first, Integer second, Integer third, Integer fourth, Integer five, Integer six) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(first);
        numbers.add(second);
        numbers.add(third);
        numbers.add(fourth);
        numbers.add(five);
        numbers.add(six);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersLessThenSix.csv", delimiter = ',')
    public void shouldExpectionWhenLessNumbersThenSix(Integer first, Integer second, Integer third, Integer fourth, Integer five) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(first);
        numbers.add(second);
        numbers.add(third);
        numbers.add(fourth);
        numbers.add(five);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/ProperNumbers.csv", delimiter = ',')
    public void properNumbers (Integer first, Integer second, Integer third, Integer fourth, Integer five, Integer six) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(first);
        numbers.add(second);
        numbers.add(third);
        numbers.add(fourth);
        numbers.add(five);
        numbers.add(six);

        int result = gamblingMachine.howManyWins(numbers);

        assertTrue(0<=result && result<6);


        //for (numbers : gamblingMachine.howManyWins(Set<Integer> userNumber))

       //int proper = gamblingMachine.howManyWins(String.valueOf(numbers));

        System.out.printf(String.valueOf(numbers));

    }


}