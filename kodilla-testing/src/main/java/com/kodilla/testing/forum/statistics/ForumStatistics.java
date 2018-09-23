package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics{
    private int userQuantity;
    private int postQuantity;
    private int commentQuantity;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.userQuantity = statistics.usersNames().size();
        this.postQuantity = statistics.postsCount();
        this.commentQuantity = statistics.commentsCount();
        if (this.userQuantity == 0) {
            this.avgPostsPerUser = 0;
            this.avgCommentsPerUser = 0;
        } else {
            this.avgPostsPerUser = (double) this.postQuantity / (double) this.userQuantity;
            this.avgCommentsPerUser = (double) this.commentQuantity / (double) this.userQuantity;
        }

        if (this.postQuantity == 0) {
            this.avgCommentsPerPost = 0;
        } else {
            this.avgCommentsPerPost = (double) this.commentQuantity / (double) this.postQuantity;
        }
    }

    public void showStatistics(){
        System.out.println("Number of users: " + this.userQuantity + "\nNumber of posts: " + this.postQuantity + "\nNumber of comments: " + this.commentQuantity + "\nAverage number of posts per user: " + this.avgPostsPerUser + "\nAverage number of comments per user: " + this.avgCommentsPerUser + "\nAverage number of comments per post: " + this.avgCommentsPerPost);
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
