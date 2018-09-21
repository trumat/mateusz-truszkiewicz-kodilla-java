package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.*;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddAndGetFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(2);
        //When
        collector.addFigure(circle);
        Shape retrievedCircle = collector.getFigure(0);
        //Then
        Assert.assertEquals(circle, retrievedCircle);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(2);
        Circle circle2 = new Circle(4);
        //When
        collector.addFigure(circle);
        collector.addFigure(circle2);
        collector.removeFigure(circle);
        Shape retrievedCircle = collector.getFigure(0);
        //Then
        Assert.assertEquals(circle2, retrievedCircle);
    }
}
