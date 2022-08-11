package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is beginning of test");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }
    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    void testAddFigure(){
        ShapeCollector.addFigure("triangle", 100);
        Assertions.assertEquals(1, Triangle.get);
    }
}
