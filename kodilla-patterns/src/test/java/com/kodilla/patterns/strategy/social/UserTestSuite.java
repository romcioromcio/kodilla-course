package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User robert = new YGeneration("Robert Lewandowski");
        User andrzej = new Millenials("Andrzej Juskowiak");
        User wojciech = new ZGeneration("Wojciech Szczęsny");

        //When
        String robertPreferences = robert.sharePost();
        System.out.println("Robert Lewandowski is a " + robertPreferences);
        String andrzejPreferences = andrzej.sharePost();
        System.out.println("Andrzej Juskowiak is a " + andrzejPreferences);
        String wojciechPreferences = wojciech.sharePost();
        System.out.println("Wojciech Szczęsny is a " + wojciechPreferences);

        //Then
        Assert.assertEquals( "Communicates using Snapchat", robertPreferences);
        Assert.assertEquals( "Communicates using Facebook", andrzejPreferences);
        Assert.assertEquals( "Communicates using Twitter", wojciechPreferences);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User zbigniew = new YGeneration("Zbigniew Boniek");

        //When
        String zbigniewPreferences = zbigniew.sharePost();
        System.out.println("Zbigniew Boniek is a " + zbigniewPreferences);
        zbigniew.setPostingPreferences(new TwitterPublisher());
        zbigniewPreferences = zbigniew.sharePost();
        System.out.println("Do boju Polsko " + zbigniewPreferences);

        //Then
        Assert.assertEquals("Communicates using Twitter", zbigniewPreferences);
    }
}
