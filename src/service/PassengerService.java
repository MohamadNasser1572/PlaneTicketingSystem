package service;

import model.Passenger;
import model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class PassengerService {
    private List<Passenger> passengers = new ArrayList<>();

    // Add a new passenger
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    // Find a passenger by ID
    public Passenger findPassengerById(int id) {
        return passengers.stream()
                .filter(passenger -> passenger.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Return all passengers
    public List<Passenger> findAllPassengers() {
        return new ArrayList<>(passengers);
    }

    // Remove a passenger by ID
    public void removePassenger(int id) {
        passengers.removeIf(passenger -> passenger.getId() == id);
    }

    // Add a ticket to a passenger's list of tickets
    public void addTicketToPassenger(int passengerId, Ticket ticket) {
        Passenger passenger = findPassengerById(passengerId);
        if (passenger != null) {
            passenger.getTickets().add(ticket);  // Adds the ticket to the passenger's list of tickets
        }
    }

    // Get all tickets for a specific passenger
    public List<Ticket> getPassengerTickets(int passengerId) {
        Passenger passenger = findPassengerById(passengerId);
        if (passenger != null) {
            return passenger.getTickets();  // Returns the passenger's list of tickets
        }
        return new ArrayList<>();  // Returns an empty list if passenger not found
    }
}
