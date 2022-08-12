package com.kodilla.testing.shape;

class Circle implements Shape {

    private String shapeName;
    private int fieldSize;

    public Circle(String shapeName, int fieldSize) {
        this.shapeName = shapeName;
        this.fieldSize = fieldSize;
    }

    public String getShapeName(String shapeName) {
        return shapeName;
    }

    public int getField(int getField) {
        return fieldSize;
    }
}
