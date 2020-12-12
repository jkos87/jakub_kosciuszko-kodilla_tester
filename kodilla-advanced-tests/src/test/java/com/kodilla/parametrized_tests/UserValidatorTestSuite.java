package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();



    @ParameterizedTest
    @ValueSource (strings = {"kz","dk"})
    public void ifToShortValidateUsernameShouldReturnFalse(String text){
        assertFalse(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource (strings = {"kz@@","dk@@!"})
    public void ifWrongCharValidateUsernameShouldReturnFalse(String text){
        assertFalse(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource (strings = {"karl","dominik"})
    public void PropertValidateUsernameShould(String text){
        assertTrue(userValidator.validateUsername(text));
    }

}