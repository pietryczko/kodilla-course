package com.kodilla.testing.shape;

class Square implements Shape {

    private double fieldSize;

    public Square(double side) {
        fieldSize = side * side;
    }
    @Override
    public String toString(){
        return "Square, field size: " + fieldSize;
    }
    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getFieldSize() {
        return fieldSize;
    }
}
