package com.kodilla.good.patterns.challenges.work2;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Producer {
    private List<Product> products = new ArrayList<>();

    public ExtraFoodShop(List<Product> products) {
        this.products = products;
    }
    @Override
    public void process(Product product) {
        System.out.println("Process ExtraFoodShop for product: " + product.getNameProduct());
    }
}
