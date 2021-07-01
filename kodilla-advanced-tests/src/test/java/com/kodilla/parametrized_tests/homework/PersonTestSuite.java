package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import static org.junit.jupiter.api.Assertions.*;

public class PersonTestSuite {

    private Person individualBMI = new Person();

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.HeightAndWeightSources#provideHeightAndWeightForTestingBMI")
    public void shouldCalculateBMI(double input, double expected) {

        assertEquals(expected, individualBMI.getBMI(input));
    }


}



