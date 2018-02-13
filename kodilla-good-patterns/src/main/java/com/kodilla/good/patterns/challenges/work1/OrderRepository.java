package com.kodilla.good.patterns.challenges.work1;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(Order order, Customer customer, LocalDateTime localDateTime);
}
