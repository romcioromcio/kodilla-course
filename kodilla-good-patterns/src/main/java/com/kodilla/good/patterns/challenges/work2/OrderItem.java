package com.kodilla.good.patterns.challenges.work2;

public final class OrderItem {
    private final Product product;
    private final double quantity;
    private boolean orderCompleted;

    public OrderItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
        this.orderCompleted = true;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getPriceProduct() * quantity;
    }

    public boolean isOrderCompleted() {
        return orderCompleted;
    }
}
