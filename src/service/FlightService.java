package service;

import model.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
    private List<Flight> flightDatabase = new ArrayList<>();

    public void addFlight(Flight flight) {
        flightDatabase.add(flight);
    }

    public Flight findFlightById(int id) {
        return flightDatabase.stream().filter(flight -> flight.getId() == id).findFirst().orElse(null);
    }

    public List<Flight> findAllFlights() {
        return new ArrayList<>(flightDatabase);
    }

    public void removeFlight(int id) {
        flightDatabase.removeIf(flight -> flight.getId() == id);
    }
}

