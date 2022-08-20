package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    private final Circle circle = new Circle(10);
    private final ShapeCollector shapeCollector = new ShapeCollector();

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is beginning of test");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @AfterEach
    public  void afterEachTest() {
        System.out.println("Test is finished");
    }
    @Nested
    @DisplayName("Add/Remove figure")
    class testAdding_Removing {
        @Test
        void testAddFigure() {
            shapeCollector.addFigure(circle);
            //Then
            assertEquals(3, shapeCollector.getFiguresSize());
        }

        @Test
        void testRemoveFigure() {
            //When
            shapeCollector.removeFigure(circle);
            //Then
            assertEquals(2, shapeCollector.getFiguresSize());
        }
    }

    @Nested
    @DisplayName("Show/Get Figure")
    class TestShow_Get {
        @Test
        void testShowFigures() {
            Square square = new Square(15);
            shapeCollector.addFigure(square);
            assertEquals("[" + square + "]", shapeCollector.showFigures());
        }

        @Test
        void testGetFigure() {
            Triangle triangle = new Triangle(10, 5);
            shapeCollector.addFigure(triangle);
            assertEquals(triangle, shapeCollector.getFigure(1));
        }

    }
}
