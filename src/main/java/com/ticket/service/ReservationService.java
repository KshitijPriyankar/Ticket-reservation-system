package com.ticket.service;
import com.ticket.model.*;
import com.ticket.database.RailwayDatabase;

import java.util.*;

public class ReservationService {
    private RailwayDatabase db = new RailwayDatabase();
    private List<Ticket> tickets = new ArrayList<>();
    public void showTrains() {
        for (Train t : db.getTrains()) {
            System.out.println("Train: " + t.getTrainNumber() +
                               " Seats: " + t.getAvailableSeats());
        }
    }
    
    public Ticket bookTicket(Passenger p, int trainNumber) {
        Train t = db.findTrain(trainNumber);
        if (t == null || t.getAvailableSeats() == 0) {
            System.out.println("Booking failed");
            return null;
        }
        t.bookSeat();
        Payment payment = new Payment(500);
        payment.process();
        Ticket ticket = new Ticket(p, t);
        tickets.add(ticket);
        System.out.println("Ticket booked successfully");
        ticket.printTicket();
        return ticket;
    }
   
    public void cancelTicket(Ticket ticket) {
        ticket.cancel();
        System.out.println("Ticket cancelled");
        ticket.printTicket();
    }
}