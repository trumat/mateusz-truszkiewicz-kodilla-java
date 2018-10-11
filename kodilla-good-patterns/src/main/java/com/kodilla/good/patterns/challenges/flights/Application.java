package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main (String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFrom("Warsaw");
        flightFinder.findTo("Rome");
        flightFinder.findThrough("Warsaw", "Gdańsk", "Rome");
    }
}
