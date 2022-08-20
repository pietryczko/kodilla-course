package com.kodilla.testing.shape;

class Triangle implements Shape {

    private double fieldSize;

    public Triangle(double height, double side) {
        fieldSize = (height * side) / 2;
    }

    @Override
    public String toString() {
        return "Triangle, field size: " + fieldSize;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getFieldSize() {
        return fieldSize;
    }
}
