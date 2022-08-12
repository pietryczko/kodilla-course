package com.kodilla.testing.shape;

class Square implements Shape {

    private final String shapeName;
    private int fieldSize;

    public Square(String shapeName, int fieldSize) {
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
