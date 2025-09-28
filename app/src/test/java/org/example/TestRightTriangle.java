package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRightTriangle {
    RightTriangle rightTriangle;

    @BeforeEach
    void setUp(){rightTriangle = new RightTriangle(1, 2);}

    @Test
    public void testArea(){assertEquals(rightTriangle.getArea(), 1);}
    @Test
    public void testPerimeter(){assertEquals(rightTriangle.getPerimeter(), 3 + (Math.sqrt(5)));}

    @Test
    public void testPolygon(){assertEquals(rightTriangle.numberOfSides(), 3);}
}
