package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream().flatMap(continent-> continent.getCoutriesList()
                .stream()).map(country-> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(sum,current)->sum.add(current));
    }
    public static void main (String[] args) throws java.lang.Exception{
    }
}
