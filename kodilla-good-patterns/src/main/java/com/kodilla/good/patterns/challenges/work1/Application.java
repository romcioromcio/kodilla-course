package com.kodilla.good.patterns.challenges.work1;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args){
      Order order = new Order();
      Customer customer = new Customer("Adam", "Smith",1);
      OrderRequest orderRequest = new OrderRequest(customer, order, LocalDateTime.now());
    }
}
