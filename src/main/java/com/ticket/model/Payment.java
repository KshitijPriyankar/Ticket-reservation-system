package com.ticket.model;

public class Payment {
    private double amount;
    private String status;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void process() {
        status = "SUCCESS";
        System.out.println("Payment of " + amount + " successful");
    }
}