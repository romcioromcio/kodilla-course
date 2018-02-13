package com.kodilla.good.patterns.challenges.work1;

public class Customer {
    private int idCustomer;
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName, int idCustomer) {
        this.idCustomer = idCustomer;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return idCustomer + " " + firstName + " " + lastName;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
