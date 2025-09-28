package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquare {
    Square square;

    @BeforeEach
    void setUp(){square = new Square(2);}

    @Test
    public void testArea(){assertEquals(square.getArea(), 4);}
    @Test
    public void testPerimeter(){assertEquals(square.getPerimeter(), 8);}
    @Test
    public void testPolygon(){assertEquals(square.numberOfSides(), 4);}
}
