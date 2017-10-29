package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Collection: begin");
    }
    @After
    public void after() {
        System.out.println("Test Collection: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        List<Integer> in = new ArrayList<>();
        List<Integer> out;
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        out= oddNumbersExterminator.exterminate(in);
        //Then
        System.out.println(out);
        Assert.assertEquals(0,out.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        List<Integer> in = new ArrayList<>();
        List<Integer> out;
        in.add(2);
        in.add(1);
        in.add(0);
        in.add(11);
        in.add(12);
        in.add(13);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        out= oddNumbersExterminator.exterminate(in);
        //Then
        System.out.println(out);
        Assert.assertEquals(3,out.size());
    }
}
