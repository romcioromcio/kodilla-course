package com.kodilla.good.patterns.challenges.work2;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Producer {
    private List<Product> products = new ArrayList<>();

    public GlutenFreeShop(List<Product> products) {
        this.products = products;
    }
    @Override
    public void process(Product product) {
        System.out.println("Process GlutenFreeShop for product: " + product.getNameProduct());
    }
}
