package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {
    Rectangle rectangle;

    @BeforeEach
    void setUp(){rectangle = new Rectangle(1, 2);}

    @Test
    public void testArea(){assertEquals(rectangle.getArea(), 2);}
    @Test
    public void testPerimeter(){assertEquals(rectangle.getPerimeter(), 6);}
}
