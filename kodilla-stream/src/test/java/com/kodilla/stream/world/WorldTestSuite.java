package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe");
        europe.addCoutry(new Country ("Poland", new BigDecimal("40000000")));
        europe.addCoutry(new Country ("France", new BigDecimal("80000000")));
        europe.addCoutry(new Country ("Denmark", new BigDecimal("20000000")));

        Continent asia = new Continent("Asia");
        asia.addCoutry(new Country("Chiny", new BigDecimal("1000000000")));
        asia.addCoutry(new Country("Japonia", new BigDecimal("60000000")));
        asia.addCoutry(new Country("Indie", new BigDecimal("1000000000")));

        Continent australia = new Continent("Australia");
        australia.addCoutry(new Country("Australia", new BigDecimal("100000000")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(australia);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("2300000000");
        Assert.assertEquals(expectedPeopleQuantity,totalPeopleQuantity);
    }
}
