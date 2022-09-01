package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTest {
    private List<String> generateUsersList(int usersQuantity) {
        List<String> usersList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String theUser = "Name " + String.valueOf(n);
            usersList.add(theUser);
        }
        return usersList;
    }

    @Mock
    private Statistics statisticsMock;

    private ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

    @BeforeEach
    void setUp() {
        forumStatistics.setUsersQuantity(10);
        forumStatistics.setPostsCount(10);
        forumStatistics.setCommentsCount(10);
    }


    @Test
    void testAdvStatisticsPostsEquals0() {
        //Given
        forumStatistics.setPostsCount(0);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        String average = forumStatistics.showStatistics();

        //Then
        Assertions.assertEquals("a", average);
    }
}
