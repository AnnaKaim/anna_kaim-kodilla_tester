package com.kodilla.parametrized_tests.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class HeightAndWeightSources {

    static Stream<Arguments> provideHeightAndWeightForTestingBMI() {
        return Stream.of(
                Arguments.of(1.67, 59.3),
                Arguments.of(1.70, 61.1),
                Arguments.of(1.92, 69.5),
                Arguments.of(1.82, 97.7),
                Arguments.of(1.74, 101.3)
        );
    }


}
