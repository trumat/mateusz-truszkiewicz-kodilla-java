package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User genYUser = new YGeneration();
        User millenialUser = new Millenials();
        User genZUser = new ZGeneration();
        //When
        String genYMedium = genYUser.sharePost();
        String millenialMedium = millenialUser.sharePost();
        String genZMedium = genZUser.sharePost();
        //Then
        Assert.assertEquals("Twitter", genYMedium);
        Assert.assertEquals("Facebook", millenialMedium);
        Assert.assertEquals("Snapchat", genZMedium);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenialUser = new Millenials();
        //When
        millenialUser.setSocialPublisher(new SnapchatPublisher());
        String newMedium = millenialUser.sharePost();
        //Then
        Assert.assertEquals("Snapchat", newMedium);
    }
}
