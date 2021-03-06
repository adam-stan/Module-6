package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> canFly = new HashMap<>();

        canFly.put("Warsaw", true);
        canFly.put("Posen", false);
        canFly.put("Krakow", true);
        canFly.put("Gdansk", false);
        canFly.put("Lodz", true);

        Boolean result = canFly.get(flight.getArrivalAirport());
        if (result != null && result) {
            System.out.println("You can fly there");
        } else throw new RouteNotFoundException();
    }
}
