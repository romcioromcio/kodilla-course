package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FlightSearch {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Prabuty", true);
        flights.put("Malbork", true);
        flights.put("Gdańsk", true);

        if (!flights.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException();
        }
    }
    public static void main(String[] args){
        FlightSearch flightSearch = new FlightSearch();
        try {Map.flights.containsKey(flight.getArrivalAirport());
            flightSearch.(new Flight("Gniew", "Kraków"));
        } catch (RouteNotFoundException e) {
            System.out.println("Errors "+ e);
        } finally {
            System.out.println("FlightSearch");
        }
    }
}
