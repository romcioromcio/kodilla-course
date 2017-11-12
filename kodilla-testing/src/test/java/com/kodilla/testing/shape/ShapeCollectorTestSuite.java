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
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape circle = new Circle("kolo1", 15);
        sc.addFigure(circle);
        System.out.println("Collection size on start test removeFigure: "+ sc.getShapes().size());
        //When
        sc.removeFigure(circle);
        //Then
        Assert.assertEquals(0,sc.getShapes().size());
        System.out.println("Collection size on end test removeFigure: "+ sc.getShapes().size());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape circle = new Circle("kolo1", 15);
        sc.addFigure(circle);
        //When
        sc.getFigure(0);
        //Then
        Assert.assertEquals(1,sc.getShapes().size());
        System.out.println("Get in collection from position: 0 " + sc.showFigures());
    }
}
