package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private double r;

    public Square(String name, double r) {
        this.name = name;
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", r=" + r +
                '}';
    }
}