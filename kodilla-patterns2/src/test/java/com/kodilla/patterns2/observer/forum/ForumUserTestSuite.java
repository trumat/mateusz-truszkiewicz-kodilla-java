package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivonneEscobar = new ForumUser("Ivonne Escobar");
        ForumUser jessePinkman = new ForumUser("Jesse Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivonneEscobar);
        javaHelpForum.registerObserver(jessePinkman);
        javaToolsForum.registerObserver(jessePinkman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with a for loop?");
        javaHelpForum.addPost("Better to use the while loop in this case");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I get a 'bad credentials' message");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivonneEscobar.getUpdateCount());
        assertEquals(5, jessePinkman.getUpdateCount());
    }
}
