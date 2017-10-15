package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(4,2);

        if (resultAdd ==6){
            System.out.println("Calkulator test add OK");
        } else {
            System.out.println("Error test Calkulator add!");
        }
        int resultSub = calculator.subtract(7,3);

        if (resultSub ==4){
            System.out.println("Calkulator test subtract OK");
        } else {
            System.out.println("Error test Calkulator subtract!");
        }
    }
}

