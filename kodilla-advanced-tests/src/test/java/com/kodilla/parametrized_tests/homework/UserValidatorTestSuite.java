package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfUsernameIsEmpty(String username) {
        assertTrue(validator.usernameIsBlank(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"Ar,2", "D,1", "d,1", "G9,2", "._,2", "88,2", "DD,2", "__,2"})
    public void shouldReturnFalseIfUsernameContainLessThanThreeCharacters(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"AreS:", "AreS!", "AreS@", "AreS#", "AreS$", "AreS:", "AreS%", "AreS^", "AreS&", "AreS*", "AreS(", "AreS)", "AreS+", "AreS=", "AreS{", "AreS}"  })
    public void shouldReturnFalseIfUsernameContainsCharactersOutsideTheRange(String username) {
        assertFalse(validator.validateUsername(username));
    }


    @ParameterizedTest
    @CsvSource(value = {"Guru321,7", "AmAdEuS1975ag.,14", "123.-_,6", "brick,5", "FLORENCE,8", "0123456789,10", "._._..--,8", "FlOrEnCe,8", "B-r-Y-k,7" })
    public void shouldCalculateUsernameLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, validator.getUsernameLengthWithoutSpaces(input));
    }


    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfEmailAddressIsEmpty(String email) {
        assertTrue(validator.emailAddressIsBlank(email));

    }

    @ParameterizedTest
    @CsvSource(value = {"kama.gmail.com", "@gmail.com", "kama@gmail", "kama@gmail.", "kama@_gmail.com", "kąma@krówka.com"})
    public void shouldReturnFalseIfEmailAddressIsInvalid(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"-kama.B123@gmail.com", "_kama.ptR@gmail.com", "KaMa123@gmail.com", "123kaMa@gmail.com"})
    public void shouldReturnTrueIfEmailAddressIsValid(String email) {
        assertTrue(validator.validateEmail(email));
    }


}




