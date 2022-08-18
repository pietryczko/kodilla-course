package com.kodilla.testing.shape;

class Circle implements Shape {
    double fieldSize;

    public Circle(double radius) {
        fieldSize = Math.PI*radius*radius;
    }
    @Override
    public String toString(){
    return "Circle, field size: " + fieldSize;
    }
    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getFieldSize() {
        return fieldSize;
    }
}
