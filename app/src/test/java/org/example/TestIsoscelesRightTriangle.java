package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIsoscelesRightTriangle {
    IsoscelesRightTriangle isoscelesRightTriangle;

    @BeforeEach
    void setUp(){isoscelesRightTriangle = new IsoscelesRightTriangle(1);}

    @Test
    public void testArea(){assertEquals(isoscelesRightTriangle.getArea(), 0.5);}
    @Test
    public void testPerimeter(){assertEquals(isoscelesRightTriangle.getPerimeter(), 2 + (Math.sqrt(2)));}
}
