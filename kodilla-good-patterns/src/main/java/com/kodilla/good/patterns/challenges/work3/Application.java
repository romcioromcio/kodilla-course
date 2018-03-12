package com.kodilla.good.patterns.challenges.work3;

public class Application {
    public static void main (String args[]) {

        SearchFlights searchFlights = new SearchFlights();

        searchFlights.searchFlightsFromCity("Gdańsk");
        searchFlights.searchFlightsToCity("Londyn");
        searchFlights.searchFlightViaCityToCity("Gdańsk", "Warszawa", "Wrocław");
    }
}
