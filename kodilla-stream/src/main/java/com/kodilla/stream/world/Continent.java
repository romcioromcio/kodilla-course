package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String continentName;
    private final List<Country> contries = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void addCoutry(Country country ){
        contries.add(country);
    }

    public List<Country> getCoutriesList() {
        return new ArrayList<>(contries);
    }
}
