package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        this.shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        this.shapes.remove(shape);
    }

    public Shape getFigure(int n){
        return shapes.get(0);
    }

    public void showFigures(){
        for(Shape shape : shapes) {
            System.out.println(shape.getShapeName() + ", area: " + shape.getArea());
        }
    }
}
