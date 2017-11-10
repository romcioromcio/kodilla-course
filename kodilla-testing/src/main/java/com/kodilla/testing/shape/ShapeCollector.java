package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public List<Shape> removeShapes() {
        return shapes;
    }
    public void getFigure(int n){ shapes.get(n);
    }

    public List<Shape> showFigures() {
        return shapes;
    }
}
