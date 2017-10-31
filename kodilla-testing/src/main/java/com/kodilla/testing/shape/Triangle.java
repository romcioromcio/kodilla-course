package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double r;

    public Triangle(String name, double r) {
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
        return "Triangle{" +
                "name='" + name + '\'' +
                ", r=" + r +
                '}';
    }
}