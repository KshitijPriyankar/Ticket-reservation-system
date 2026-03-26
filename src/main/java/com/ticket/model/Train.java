package com.ticket.model;

public class Train {
    private int trainNumber;
    private String source;
    private String destination;
    private int availableSeats;

    public Train(int trainNumber, String source, String destination, int seats) {

        if (trainNumber < 10000 || trainNumber > 99999) {
            throw new IllegalArgumentException("Train number must be 5 digits");
        }

        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.availableSeats = seats;
    }

    public int getTrainNumber() { return trainNumber; }
    public int getAvailableSeats() { return availableSeats; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }

    public void bookSeat() {
        if (availableSeats > 0) availableSeats--;
    }
}