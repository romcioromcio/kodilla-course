package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2.0, 1.0);
        } catch (Exception e) {
            System.out.println("Errors "+ e);
        } finally {
            System.out.println("Second Challenge");
        }
    }
}
