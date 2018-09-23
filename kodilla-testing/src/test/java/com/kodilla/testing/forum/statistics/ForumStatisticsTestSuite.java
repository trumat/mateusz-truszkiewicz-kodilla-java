package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    public static ForumStatistics getForumStatistics(int posts, int comments, int users){
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statistics.commentsCount()).thenReturn(comments);
        when(statistics.postsCount()).thenReturn(posts);
        ArrayList<String> usersList = new ArrayList<String>();
        for (Integer i = 0; i < users; i++){
            usersList.add(i.toString());
        }
        when(statistics.usersNames()).thenReturn(usersList);
        forumStatistics.calculateAdvStatistics(statistics);
        return forumStatistics;
    }

    @Test
    public void test0Posts(){
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        double avgCommentsPerPost = forumStatistics.getAvgCommentsPerPost();
        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(0, avgCommentsPerPost, 0.0);
        Assert.assertEquals(0, avgPostsPerUser, 0.0);
    }

    @Test
    public void test1000Posts() {
        //Given
        ForumStatistics forumStatistics = getForumStatistics(1000, 0, 10);
        //When
        double avgCommentsPerPost = forumStatistics.getAvgCommentsPerPost();
        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(0, avgCommentsPerPost, 0.0);
        Assert.assertEquals(100, avgPostsPerUser, 0.0);
    }

    @Test
    public void test0Comments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        double avgCommentsPerPost = forumStatistics.getAvgCommentsPerPost();
        double avgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        //Then
        Assert.assertEquals(0, avgCommentsPerPost, 0.0);
        Assert.assertEquals(0, avgCommentsPerUser, 0.0);
    }

    @Test
    public void testCommentsLessThanPosts(){
        //Given
        ForumStatistics forumStatistics = getForumStatistics(1000, 100, 10);
        //When
        double avgCommentsPerPost = forumStatistics.getAvgCommentsPerPost();
        double avgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(0.1, avgCommentsPerPost, 0.0);
        Assert.assertEquals(10, avgCommentsPerUser, 0.0);
        Assert.assertEquals(100, avgPostsPerUser, 0.0);
    }

    @Test
    public void testCommentsMoreThanPosts(){
        //Given
        ForumStatistics forumStatistics = getForumStatistics(1000, 10000, 10);
        //When
        double avgCommentsPerPost = forumStatistics.getAvgCommentsPerPost();
        double avgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(10, avgCommentsPerPost, 0.0);
        Assert.assertEquals(1000, avgCommentsPerUser, 0.0);
        Assert.assertEquals(100, avgPostsPerUser, 0.0);
    }

    @Test
    public void test0Users(){
        //Given
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        double avgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(0, avgCommentsPerUser, 0.0);
        Assert.assertEquals(0, avgPostsPerUser, 0.0);
    }

    @Test
    public void test100Users() {
        //Given
        ForumStatistics forumStatistics = getForumStatistics(10, 10, 100);
        //When
        double avgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        double avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(0.1, avgCommentsPerUser, 0.0);
        Assert.assertEquals(0.1, avgPostsPerUser, 0.0);
    }
}
