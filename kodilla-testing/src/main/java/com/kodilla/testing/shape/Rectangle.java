package com.kodilla.testing.shape;

class Rectangle implements Shape {

    private final String shapeName;
    private int fieldSize;

    public Rectangle(String shapeName, int fieldSize) {
        this.shapeName = shapeName;
        this.fieldSize = fieldSize;
    }

    public String getShapeName(String shapeName) {
        return shapeName;
    }

    public int getField(int fieldSize) {
        return fieldSize;
    }
}
