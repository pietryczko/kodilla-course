package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    private OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When create list of numbers, then oddNumberExterminator should return only even numbers")
    @Test
    private void testOddNumberExterminatorNormalList() {
        //Given
        List<Integer> result = oddNumberExterminator.exterminate(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //When
        List<Integer> expectedResult = Arrays.asList(2, 4, 6, 8, 10);

        //Then
        Assertions.assertEquals(expectedResult, result);

    }

    @DisplayName("When create empty list of numbers, then oddNumberExterminator should return empty list")
    @Test
    private void testOddNumberExterminatorEmptyList() {
        //Given
        List<Integer> result = oddNumberExterminator.exterminate(Arrays.asList());

        //When
        List<Integer> expectedResult = Arrays.asList();

        //Then
        Assertions.assertEquals(expectedResult, result);

    }

}
