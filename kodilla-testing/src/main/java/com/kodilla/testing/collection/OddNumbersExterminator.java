package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        int temporaryValue = 0;
        for (int n=0; n<numbers.size(); n++){
            temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0){
                 evenNumbers.add(temporaryValue);
            }
        }
        return evenNumbers;
    }
}
