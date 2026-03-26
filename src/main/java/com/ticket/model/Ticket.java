package com.ticket.model;
import java.util.Random;
public class Ticket {
    private int ticketId;
    private Passenger passenger;
    private Train train;
    private String status;
    private String seatNumber;
    public Ticket(Passenger passenger, Train train) {
        this.ticketId = generateTicketId();
        this.passenger = passenger;
        this.train = train;
        this.status = "BOOKED";
        this.seatNumber = generateSeatNumber();
    }
    private int generateTicketId() {
        Random rand = new Random();
        return 10000 + rand.nextInt(90000);
    }
    private String generateSeatNumber() {
        Random rand = new Random();
        char coach = (char) ('A' + rand.nextInt(3));
        int seat = 1 + rand.nextInt(50);
        return coach + "-" + seat;
    }
    public void cancel() {
        status = "CANCELLED";
    }
    public void printTicket() {
        System.out.println("\n========== TICKET ==========");
        System.out.println("Ticket ID   : " + ticketId);
        System.out.println("Passenger   : " + passenger.getName());
        System.out.println("Train No    : " + train.getTrainNumber());
        System.out.println("Route       : " + train.getSource() + " -> " + train.getDestination());
        System.out.println("Seat No     : " + seatNumber);
        System.out.println("Status      : " + status);
        System.out.println("============================\n");
    }
}