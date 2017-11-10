package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestStatistic {
    ForumStatistics forumStatistics;

    @Test
    public void addPostNull(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersListTest = new ArrayList<>();
        usersListTest.add("Ewa");
        usersListTest.add("Piotr");
        usersListTest.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(usersListTest);
        when (statisticsMock.postsCount()).thenReturn(0);
        when (statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.quantityPostCount);
        System.out.println("Average Post/Users= "+ forumStatistics.averagePostUsers + " Average Comments/Post= " +forumStatistics.averageCommentsPost);
    }

    @Test
    public void addPostThousand(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersListTest = new ArrayList<>();
        usersListTest.add("Ewa");
        usersListTest.add("Piotr");
        usersListTest.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(usersListTest);
        when (statisticsMock.postsCount()).thenReturn(1000);
        when (statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, forumStatistics.quantityPostCount);
        System.out.println("Average Post/Users= "+ forumStatistics.averagePostUsers + " Average Comments/Post= " +forumStatistics.averageCommentsPost);
    }

    @Test
    public void addCommentsNull(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersListTest = new ArrayList<>();
        usersListTest.add("Ewa");
        usersListTest.add("Piotr");
        usersListTest.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(usersListTest);
        when (statisticsMock.postsCount()).thenReturn(100);
        when (statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.quantityCommentsCount);
        System.out.println("Average Comments/Users= "+ forumStatistics.averageCommentsUsers + " Average Comments/Post= " +forumStatistics.averageCommentsPost);
    }

    @Test
    public void commentsMoreTanPost(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersListTest = new ArrayList<>();
        usersListTest.add("Ewa");
        usersListTest.add("Piotr");
        usersListTest.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(usersListTest);
        when (statisticsMock.postsCount()).thenReturn(100);
        when (statisticsMock.commentsCount()).thenReturn(200);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(200, forumStatistics.quantityCommentsCount);
        System.out.println("Average Comments/Users= "+ forumStatistics.averageCommentsUsers + " Average Comments/Post= " +forumStatistics.averageCommentsPost);
    }

    @Test
    public void postMoreTanComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersListTest = new ArrayList<>();
        usersListTest.add("Ewa");
        usersListTest.add("Piotr");
        usersListTest.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(usersListTest);
        when (statisticsMock.postsCount()).thenReturn(200);
        when (statisticsMock.commentsCount()).thenReturn(20);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(20, forumStatistics.quantityCommentsCount);
        System.out.println("Average Comments/Users= "+ forumStatistics.averageCommentsUsers + " Average Comments/Post= " +forumStatistics.averageCommentsPost);
    }

    @Test
    public void usersNull(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersListTest = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersListTest);
        when (statisticsMock.postsCount()).thenReturn(100);
        when (statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.quantityUsers);
        System.out.println("Average Comments/Users= "+ forumStatistics.averageCommentsUsers + " Average Post/User= " +forumStatistics.averagePostUsers);
    }

    private List<String> generateListOfUsers(int usersQuantity) {
        List<String> usersListTest = new ArrayList<>();
        for(int n = 1; n <= usersQuantity; n++){
            usersListTest.add("User " + n);
        }
        return usersListTest;
    }

    @Test
    public void usersHundred(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics(statisticsMock);

        List<String> usersListTest = new ArrayList<>();
        List<String> resultListOf100Users = generateListOfUsers(100);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users );
        when (statisticsMock.postsCount()).thenReturn(100);
        when (statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.quantityUsers);
        System.out.println("Average Comments/Users "+ forumStatistics.averageCommentsUsers + " Average Post/User " +forumStatistics.averagePostUsers);
    }
}
