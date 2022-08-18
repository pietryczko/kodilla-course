package com.kodilla.testing.shape;

class Rectangle implements Shape {

    private double sideA;
    private double sideB;
    private double height;
    private double fieldSize;

    public Rectangle(double sideA, double sideB, double height) {
        fieldSize = ((sideA + sideB) * height) / 2;
    }
    @Override
    public String toString(){
        return "Rectangle, field size: " + fieldSize;
    }
    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public double getFieldSize() {
        return fieldSize;
    }
}
