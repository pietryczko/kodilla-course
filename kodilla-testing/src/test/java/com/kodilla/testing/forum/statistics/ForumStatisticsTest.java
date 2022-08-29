package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTest {
    @Mock
    private Statistics statisticsMock;

    @Test
    void testAdvStatistics() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        String result = forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals("a", result);
    }

    private int generatePosts(int postsQuantity) {
        for (int i = 0; i < postsQuantity; i++) {

        }
    }
}
