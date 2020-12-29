package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import static org.junit.jupiter.api.Assertions.*;

class StringSourcesTestSuite {
    StringManipulator stringManipulator = new StringManipulator();

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, Integer expected) {
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

}