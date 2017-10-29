package com.kodilla.exception.challenge;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException  {
        try{
            return a/b;
        } catch (ArithmeticException e){
                throw new ArithmeticException();
        }finally {
            System.out.println("First Challenge");
        }
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
