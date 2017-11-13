package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int[] board = {9,9,9,9,9,8,8,8,8,8,2,2,2,2,2,1,1,1,1,1};

        //When
        double averageNumbers = ArrayOperations.getAverage(board);

        //Then
        Assert.assertEquals(5,averageNumbers ,0);
    }
}
