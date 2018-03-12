package com.kodilla.good.patterns.challenges.work3;

import java.util.HashSet;

public class FlightDatabase {
        private static HashSet<Flight> flighDatabase = new HashSet<>();

        public static HashSet<Flight> getFlighDatabase() {
            Flight gdWa = new Flight("Gdańsk", "Warszawa");
            Flight gdWr = new Flight("Gdańsk", "Wrocłąw");
            Flight gdKr = new Flight("Gdańsk", "Kraków");
            Flight gdLo = new Flight("Gdańsk", "Londyn");
            Flight waKr = new Flight("Warszawa", "Kraków");
            Flight waWr = new Flight("Warszawa", "Wrocław");
            Flight waMo = new Flight("Warszawa", "Moskwa");
            Flight waLo = new Flight("Warszawa", "Londyn");
            Flight krWr = new Flight("Kraków", "Wrocław");
            Flight krPr = new Flight("Kraków", "Praga");
            Flight wrLo = new Flight("Wrocław", "Londyn");

            flighDatabase.add(gdWa);
            flighDatabase.add(gdWr);
            flighDatabase.add(gdKr);
            flighDatabase.add(gdLo);
            flighDatabase.add(waKr);
            flighDatabase.add(waWr);
            flighDatabase.add(waMo);
            flighDatabase.add(waLo);
            flighDatabase.add(krWr);
            flighDatabase.add(krPr);
            flighDatabase.add(wrLo);

            return flighDatabase;
        }
}
