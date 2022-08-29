package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private Statistics Statistics;

    public ForumStatistics(Statistics statistics) {
        this.Statistics = statistics;
    }

    String calculateAdvStatistics(Statistics statistics) {
        int usersQuantity = Statistics.usersNames().size();
        int postsCount = Statistics.postsCount();
        int commentsCount = Statistics.commentsCount();
        int postsPerUser = Statistics.postsCount() / usersQuantity;
        int commentsPerUser = Statistics.commentsCount() / usersQuantity;
        int commentsPerPost = Statistics.commentsCount() / Statistics.postsCount();

        return "Forum have " + usersQuantity + " users; " + postsCount + " posts; " + commentsCount + " comments." + "\r" +
                "Average value of posts per user " + postsPerUser + "\r" +
                "Average value of comments per user " + commentsPerUser + "\r" +
                "Average value of comments per post " + commentsPerPost;
    }

}


