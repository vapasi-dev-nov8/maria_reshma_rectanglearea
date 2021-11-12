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
    public void shouldCalculateAreaWhenWidthandBreadthofRectangleGiven(double width, double breadth, double expectedArea) {

        Rectangle rectangle = new Rectangle(width, breadth);

        double actualArea = rectangle.area();

        assertEquals(expectedArea, actualArea);
    }

    @ParameterizedTest
    @MethodSource("provideInputstoPerimeterMethod")
    public void shouldCalculatePerimeterWhenWidthandBreadthofRectangleGiven(double width, double breadth, double expectedPerimeter) {

        Rectangle rectangle = new Rectangle(width, breadth);

        double actualPerimeter = rectangle.perimeter();

        assertEquals(expectedPerimeter, actualPerimeter);

    }

    private static Stream<Arguments> provideInputstoAreaMethod() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 6.0),
                Arguments.of(2.0, 0.0, 0),
                Arguments.of(0.0, 3.0, 0),
                Arguments.of(5, 3, 15)
        );
    }

    private static Stream<Arguments> provideInputstoPerimeterMethod() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 10.0),
                Arguments.of(2.0, 0.0, 4),
                Arguments.of(0.0, 3.0, 6),
                Arguments.of(5, 3, 16)
        );
    }

}