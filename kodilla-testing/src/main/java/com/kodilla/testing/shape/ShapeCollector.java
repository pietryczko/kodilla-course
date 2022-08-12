package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    private static List<Shape> figures = new ArrayList<>();

    public ShapeCollector(Shape shape){
        this.shape = shape;
    }

    static void addFigure(Shape shape) {

    }

    public static boolean removeFigure(Shape shape) {

        return false;
    }

    static int getFigure(int n) {
        return 0;
    }
    static int getFigureSize(){
        return 0;
    }
    public static void showFigures() {

    }
}
