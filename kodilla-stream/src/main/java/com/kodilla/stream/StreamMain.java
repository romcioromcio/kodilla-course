package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Tytus, Romek",a-> a.toUpperCase());
        poemBeautifier.beautify("Zawisza Czarny",a-> a.replace("a", "A"));
        poemBeautifier.beautify(" ale czy to ok ",a-> a.replace(" ", "XX"));
        poemBeautifier.beautify("Drukarki, Skanery",a-> a.replace("a", "WWW"));
        poemBeautifier.beautify("Litery polskie ",a-> a.concat("ABC"));
        poemBeautifier.beautify("CZYSTY KOD ",a-> a.toLowerCase());
    }
}
