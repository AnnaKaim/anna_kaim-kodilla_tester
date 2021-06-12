package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuite {

    @Test
    public void testFindingDepartures() {
        // given
        FlightRepository.getFlightsTable();
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Frankfurt");
        //then
        assertEquals(3, result.size());
    }

    @Test
    public void testFindingArrivals() {
        // given
        FlightRepository.getFlightsTable();
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Prague");
        //then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldNotFoundArrivalsIfProvidedTownIsOutOfTheFlightTable() {
        // given
        FlightRepository.getFlightsTable();
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Vienna");
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void shouldNotFoundDeparturesIfProvidedTownIsOutOfTheFlightTable() {
        // given
        FlightRepository.getFlightsTable();
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Cracow");
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void shouldNotFoundDeparturesIfProvidedWrongTownName() {
        // given
        FlightRepository.getFlightsTable();
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Okland");
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void shouldNotFoundArrivalsIfProvidedWrongTownName() {
        // given
        FlightRepository.getFlightsTable();
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Praga");
        //then
        assertEquals(0, result.size());
    }

}