package com.kodilla.good.patterns.challenges.work2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws java.lang.Exception {
        List<Product> theList = new ArrayList<>();
        theList.add(new Product("Bread", 4));
        theList.add(new Product("Milk", 3.3));
        theList.add(new Product("Cheese", 10));
        theList.add(new Product("Sour cream", 3));

        OrderItem orderItem = new OrderItem(new Product("Cake", 10), 3);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(theList);
        OrderProcessor orderProcessor = new OrderProcessor(extraFoodShop);
        orderProcessor.process(orderItem);
        System.out.println("Total of the order is " + orderItem.getValue() + " euro");
    }
}
