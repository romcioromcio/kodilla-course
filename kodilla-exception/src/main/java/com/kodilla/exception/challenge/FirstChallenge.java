package com.kodilla.exception.challenge;

import com.kodilla.exception.io.FileReaderException;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("We do not divide by 0!");
        }finally {
            System.out.println("First Challenge");
        }
    }
}
