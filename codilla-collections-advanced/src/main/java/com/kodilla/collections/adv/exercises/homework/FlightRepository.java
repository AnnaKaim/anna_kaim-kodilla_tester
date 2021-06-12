package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warsaw", "Budapest"));
        flightsTable.add(new Flight("Brussels", "Prague"));
        flightsTable.add(new Flight("Barcelona", "Oakland"));
        flightsTable.add(new Flight("Budapest", "Frankfurt"));
        flightsTable.add(new Flight("Frankfurt", "Brussels"));
        flightsTable.add(new Flight("Frankfurt", "Oakland"));
        flightsTable.add(new Flight("Frankfurt", "Prague"));
        return flightsTable;
    }
}


