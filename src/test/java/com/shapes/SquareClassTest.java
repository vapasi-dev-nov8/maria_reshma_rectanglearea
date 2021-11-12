package com.shapes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareClassTest {
    @ParameterizedTest
    @MethodSource("provideInputstoAreaMethod")
    public void shouldCalculateAreaWhenSideofSquareGiven(double side, double expectedArea) {

        Square square = new Square(side);

        double actualArea = square.area();

        assertEquals(expectedArea, actualArea);
    }

    @ParameterizedTest
    @MethodSource("provideInputstoPerimeterMethod")
    public void shouldCalculatePerimeterWhenWidthandBreadthofRectangleGiven(double side, double expectedPerimeter) {

        Square square = new Square(side);

        double actualPerimeter = square.perimeter();

        assertEquals(expectedPerimeter, actualPerimeter);

    }

    private static Stream<Arguments> provideInputstoAreaMethod() {
        return Stream.of(
                Arguments.of(2.0, 4.0),
                Arguments.of(4, 16),
                Arguments.of(0.0, 0),
                Arguments.of(5, 25)
        );
    }

    private static Stream<Arguments> provideInputstoPerimeterMethod() {
        return Stream.of(
                Arguments.of(8.0, 32.0),
                Arguments.of(2.0, 8),
                Arguments.of(0.0, 0),
                Arguments.of(5, 20.0)
        );
    }

}