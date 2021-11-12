package com.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleClassTest {
    @Test
    public void shouldCalculateAreaWhenWidthandBreadthofRectangleGiven() {

        Rectangle rectangle = new Rectangle(5.0,3.0);

        assertEquals(15.0, rectangle.area());

        Rectangle rectangle1 = new Rectangle(5,3);

        assertEquals(15, rectangle1.area());
    }

    @Test
    public void shouldCalculatePerimeterWhenWidthandBreadthofRectangleGiven() {

        Rectangle rectangle = new Rectangle(5.0,3.0);

        assertEquals(16, rectangle.perimeter());

    }
}
