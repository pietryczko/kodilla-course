package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int [] numberArray = {0,1,4,15};

        //When
        double actualAverage = ArrayOperations.getAverage(numberArray);

        //Then
        assertEquals(5, actualAverage);
    }
}
