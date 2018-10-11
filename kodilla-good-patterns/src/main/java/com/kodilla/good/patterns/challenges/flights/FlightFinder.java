package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private final HashSet<Flight> flights = new HashSet<>();

    public FlightFinder() {
        flights.add(new Flight("Warsaw", "Gdańsk"));
        flights.add(new Flight("Gdańsk", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Rome"));
        flights.add(new Flight("Warsaw", "Rome"));
    }
    public void findFrom (String origin){
        List<Flight> resultFlights = flights.stream()
                .filter(f -> f.getOrigin().equals(origin))
                .collect(Collectors.toList());
        if (resultFlights.size() == 0) {
            System.out.println("No flights from " + origin + " found");
        } else {
            System.out.println("Flights from " + origin + ":");
            resultFlights.stream()
                    .forEach(System.out::println);
        }
    }

    public void findTo (String destination) {
        List<Flight> resultFlights = flights.stream()
                .filter(f -> f.getDestination().equals(destination))
                .collect(Collectors.toList());
        if (resultFlights.size() == 0) {
            System.out.println("No flights to " + destination + " found");
        } else {
            System.out.println("Flights to " + destination + ":");
            resultFlights.stream()
                    .forEach(System.out::println);
        }
    }

    public void findThrough (String origin, String through, String destination) {
        List<Flight> resultFlights = flights.stream()
                .filter(f -> (f.getOrigin().equals(origin) && f.getDestination().equals(through)) || (f.getOrigin().equals(through) && f.getDestination().equals(destination)))
                .collect(Collectors.toList());
        if (resultFlights.size() == 2) {
            System.out.println ("Flight from " + origin + " to " + destination + " through " + through + " found");
        } else {
            System.out.println("Flight from " + origin + " to " + destination + " through " + through + " not found");
        }
    }
}