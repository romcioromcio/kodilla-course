package com.kodilla.good.patterns.challenges.work3;

import java.util.Objects;

public class Flight {
    private String airportStart;
    private String airportEnd;

    public Flight(String airportStart, String airportEnd) {
        this.airportStart = airportStart;
        this.airportEnd = airportEnd;
    }

    public String getAirportStart() {
        return airportStart;
    }

    public String getAirportEnd() {
        return airportEnd;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airportStart='" + airportStart + '\'' +
                ", airportEnd='" + airportEnd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(airportStart, flight.airportStart) &&
                Objects.equals(airportEnd, flight.airportEnd);
    }

    @Override
    public int hashCode() {

        return Objects.hash(airportStart, airportEnd);
    }
}
