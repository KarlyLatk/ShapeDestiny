package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCircle {
    Circle circle;

    @BeforeEach
    void setUp(){circle = new Circle(1);}

    @Test
    public void testArea(){assertEquals(circle.getArea(), Math.PI);}
    @Test
    public void testPerimeter(){assertEquals(circle.getPerimeter(), 2*Math.PI);}

}
