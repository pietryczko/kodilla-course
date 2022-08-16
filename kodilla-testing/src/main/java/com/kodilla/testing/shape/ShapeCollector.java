package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    private static List<Shape> figures = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    static void addFigure(Shape shape) {

    }

    static void removeFigure(Shape shape) {

    }

    static int getFigure(int n) {
        return 0;
    }

    static int getFigureSize() {
        return 0;
    }

    static Shape showFigures() {
        return null;
    }
}

