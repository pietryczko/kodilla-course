package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbablyIWillThrowExceptionTestSuite {
@Test
    public void testExceptionHandling() {
    //given
    SecondChallenge secondChallenge = new SecondChallenge();

    //when & then
    assertAll(
            () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5)),
            () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5)),
            () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1))
    );
}
}
