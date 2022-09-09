package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersQuantity;
    private int postsCount;
    private int commentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public ForumStatistics(Statistics statistics) {

    }

    void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        postsPerUser = (double) statistics.postsCount() / usersQuantity;
        commentsPerUser = (double) statistics.commentsCount() / usersQuantity;
        commentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public String showStatistics() {
        return "Posts per user: " + postsPerUser + ", Comments per user: " + commentsPerUser + ", Comments per post: " + commentsPerPost;
    }
}

