package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMac() {
        //When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Roll without sesame")
                .burgers(2)
                .sauce("1000 islands sauce")
                .ingredient("Salat")
                .ingredient("Cheese")
                .ingredient("Becon")
                .build();
        System.out.println(bigmac);

        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        String whichRoll = bigmac.getRoll();
        String whichSauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("Roll without sesame", whichRoll);
        Assert.assertEquals("1000 islands sauce", whichSauce);
    }

    @Test(expected = IllegalStateException.class)
    public void testBigMacIncorrectInputs() {
        //When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Roll without sesame")
                .sauce("Mayonnaise")
                .ingredient("Chili pepper")
                .build();

        int howManyIngredients = bigmac.getIngredients().size();
        String whichSauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(0, howManyIngredients);
        Assert.assertNotEquals("Roll with sesame", bigmac.getRoll());
        Assert.assertNotEquals("Barbecue sauce", whichSauce);
    }
}
