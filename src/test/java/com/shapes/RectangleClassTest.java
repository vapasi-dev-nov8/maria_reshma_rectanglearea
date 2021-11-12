package com.shapes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleClassTest {
    @ParameterizedTest
    @MethodSource("provideInputstoAreaMethod")
    public void shouldCalculateAreaWhenWidthandBreadthofRectangleGiven(double width, double breadth, double expectedArea) {

        Rectangle rectangle = new Rectangle(width, breadth);

        double actualArea = rectangle.area();

        assertEquals(expectedArea, actualArea);
    }

//    @Test
//    public void shouldCalculateAreaWhenWidthandBreadthofRectangleGiven() {
//
//        Rectangle rectangle = new Rectangle(5.0,3.0);
//
//        assertEquals(15.0, rectangle.area());
//
//        Rectangle rectangle1 = new Rectangle(5,3);
//
//        assertEquals(15, rectangle1.area());
//    }

    @Test
    public void shouldCalculatePerimeterWhenWidthandBreadthofRectangleGiven() {

        Rectangle rectangle = new Rectangle(5.0,3.0);

        assertEquals(16, rectangle.perimeter());

    }

    private static Stream<Arguments> provideInputstoAreaMethod(){
        return Stream.of(
                Arguments.of(2.0, 3.0, 6.0),
                Arguments.of(2.0, 0.0, 0),
                Arguments.of(0.0, 3.0, 0),
                Arguments.of(5, 3, 15)
        );
    }




}
