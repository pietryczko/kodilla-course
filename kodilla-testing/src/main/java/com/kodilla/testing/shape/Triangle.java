package com.kodilla.testing.shape;

class Triangle implements Shape {

    private String shapeName;
    private int fieldSize;

    public Triangle(String shapeName, int fieldSize) {
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
