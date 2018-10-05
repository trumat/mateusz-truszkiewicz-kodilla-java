package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Prague", false);
        flightMap.put("Mumbai", true);
        flightMap.put("Moscow", false);

        if (flightMap.containsKey(flight.getArrivalAirport()) && flightMap.containsKey(flight.getDepartureAirport())) {
            if (flightMap.get(flight.getArrivalAirport()) && flightMap.get(flight.getDepartureAirport())) {
                System.out.println("Flight available");
            } else {
                System.out.println("Flight unavailable");
            }
        } else {
            throw new RouteNotFoundException("Airport not present in the map");
        }
    }

    public static void main (String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Warsaw", "Mumbai"));
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
