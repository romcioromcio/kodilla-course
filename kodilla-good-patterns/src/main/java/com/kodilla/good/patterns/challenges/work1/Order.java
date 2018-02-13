package com.kodilla.good.patterns.challenges.work1;

public class Order {
    private int numberOrder;
    private int numberProduct;

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public int getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(int numberProduct) {
        this.numberProduct = numberProduct;
    }

    @Override
    public String toString() {
        return "Order{" +
                "numberOrder=" + numberOrder +
                ", numberProduct=" + numberProduct +
                '}';
    }
}
