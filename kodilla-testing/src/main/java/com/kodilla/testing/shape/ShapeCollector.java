package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private static final List<Shape> figures = new ArrayList<>();

    int getFiguresListSize() {
        return figures.size();
    }

    void addFigure(Shape shape) {
        figures.add(shape);
    }

    void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    Shape getFigure(int n) {
        return figures.get(n);
    }

    String showFigures() {
        return figures.toString();
    }
}

