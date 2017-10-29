package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape circle = new Circle("kolo1", 15);
        //When
        sc.addFigure(circle);
        //Then
        System.out.println(sc.getShapes().get(0));
        System.out.println(sc.getShapes().get(0).getShapeName());
        System.out.println(sc.getShapes().get(0).getField());
        Assert.assertEquals(1,sc.getShapes().size());

    }
}
