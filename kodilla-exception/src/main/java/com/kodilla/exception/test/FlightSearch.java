package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FlightSearch {
    public void findFilght(Flight flight){
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Prabuty", true);
        flights.put("Malbork", true);
        flights.put("Gdańsk", true);
        //wyszukać przy pomocy stream dany lot i rzucić wyjątkiem gdy niezznaleziono
    }
    public static void main(String[] args){
        FlightSearch.findFilght().stream().filter(flight -> flight=="Prabuty");
    }
}
