package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is beginning of test");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Add/Remove figure")
    class testAdding_Removing {
        @Test
        void testAddFigure() {
            //Given
            Shape shape1 = new Circle("Circle", 100);
            //When
            ShapeCollector.addFigure(shape1);
            //Then
            assertEquals(1, ShapeCollector.getFigureSize());
        }

        @Test
        void testRemoveFigure() {
            //Given
            Shape shape1 = new Circle("Circle", 100);
            ShapeCollector.addFigure(shape1);
            //When
            ShapeCollector.removeFigure(shape1);
            //Then
            assertEquals(0, ShapeCollector.getFigureSize());
        }
    }

    @Nested
    @DisplayName("Show/Get Figure")
    class TestShow_Get {
        @Test
        void testGetFigure() {
            //Given
            Shape shape1 = new Circle("Circle", 100);
            ShapeCollector.addFigure(shape1);
            //When
            int retrievedFigure = ShapeCollector.getFigure(0);
            //Then
            assertEquals(shape1, retrievedFigure);
        }

        @Test
        void testShowFigures() {
            //Given
            Shape shape1 = new Circle("Circle", 100);
            ShapeCollector.addFigure(shape1);
            //When
            int retrievedFigure = ShapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals("Circle 100", ShapeCollector.showFigures());
        }
    }
}
