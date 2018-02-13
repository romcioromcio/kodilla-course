package com.kodilla.good.patterns.challenges.work1;

import java.time.LocalDateTime;

public class OrderRequest {
    private Customer customer;
    private Order order;
    private LocalDateTime localDateTime;

    public OrderRequest(Customer customer, Order order, LocalDateTime localDateTime) {
        this.customer = customer;
        this.order = order;
        this.localDateTime = localDateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
