package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

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

    @BeforeEach
    void beforeEach() {
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(List.of("John", "Jack", "James", "George"));
    }

    private ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
    private String result;

    @Test
    void testAdvStatistics() {
        //Given
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        result = forumStatistics.showStatistics();

        //Then
        assertEquals("Posts per user: " + 2.5 + ", Comments per user: " + 2.5 + ", Comments per post: " + 1.0, result);
    }

    @Test
    void testAdvStatisticsPostsEquals0() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        result = forumStatistics.showStatistics();

        //Then
        assertEquals("Posts per user: " + 0.0 + ", Comments per user: " + 2.5 + ", Comments per post: " + Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testAdvStatisticsPostsEquals1000() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        result = forumStatistics.showStatistics();

        //Then
        assertEquals("Posts per user: " + 250.0 + ", Comments per user: " + 2.5 + ", Comments per post: " + 0.01, result);
    }

    @Test
    void testAdvStatisticsCommentsEquals0() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        result = forumStatistics.showStatistics();

        //Then
        assertEquals("Posts per user: " + 2.5 + ", Comments per user: " + 0.0 + ", Comments per post: " + 0.0, result);
    }

    @Test
    void testAdvStatisticsCommentsEquals1000() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(1000);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        result = forumStatistics.showStatistics();

        //Then
        assertEquals("Posts per user: " + 2.5 + ", Comments per user: " + 250.0 + ", Comments per post: " + 100.0, result);
    }

    @Test
    void testAdvStatisticsMoreCommentsThanPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        result = forumStatistics.showStatistics();

        //Then
        assertEquals("Posts per user: " + 2.5 + ", Comments per user: " + 25.0 + ", Comments per post: " + 10.0, result);
    }

    @Test
    void testAdvStatisticsMorePostsThanComments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(5);
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        result = forumStatistics.showStatistics();

        //Then
        assertEquals("Posts per user: " + 2.5 + ", Comments per user: " + 1.25 + ", Comments per post: " + 0.5, result);
    }

    @Test
    void testAdvStatistics0Users() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(List.of());
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        result = forumStatistics.showStatistics();

        //Then
        assertEquals("Posts per user: " + Double.POSITIVE_INFINITY + ", Comments per user: " + Double.POSITIVE_INFINITY + ", Comments per post: " + 1.0, result);
    }

    @Test
    void testAdvStatistics1000Users() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(generateUsersList(100));
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        result = forumStatistics.showStatistics();

        //Then
        assertEquals("Posts per user: " + 0.1 + ", Comments per user: " + 0.1 + ", Comments per post: " + 1.0, result);
    }

}
