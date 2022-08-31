package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    private String calculateAdvStatistics() {
        int userNumber = this.statistics.usersNames().size();
        int postsCount = this.statistics.postsCount();
        int commentsCount = this.statistics.commentsCount();
        int postsPerUser = this.statistics.postsCount() / userNumber;
        double commentsPerUser = (double) this.statistics.commentsCount() / userNumber;
        int commentsPerPost = this.statistics.commentsCount() / this.statistics.postsCount();

        return "Forum have " + userNumber + " users; " + postsCount + " posts; " + commentsCount + " comments." + "\r" +
                "Average value of posts per user " + postsPerUser + "\r" +
                "Average value of comments per user " + commentsPerUser + "\r" +
                "Average value of comments per post " + commentsPerPost;
    }

}


