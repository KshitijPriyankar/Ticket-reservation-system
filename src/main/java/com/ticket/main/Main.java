package com.ticket.main;

import com.ticket.model.*;
import com.ticket.service.ReservationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReservationService service = new ReservationService();
         if (System.console() == null) {
            System.out.println("Running in non-interactive mode (CI/CD)");

            Passenger p = new Passenger(1, "AutoUser", 25);
            service.bookTicket(p, 12591);

            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        Passenger p = new Passenger(1, name, 22);
        service.showTrains();
        System.out.println("Enter train number:");
        int trainNo = sc.nextInt();
        if (trainNo < 10000 || trainNo > 99999) {
            System.out.println("Invalid train number (must be 5 digits)");
            return;
        }
        Ticket ticket = service.bookTicket(p, trainNo);
        if (ticket != null) {
            System.out.println("Do you want to cancel? (Yes/No)");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("Yes")) {
                service.cancelTicket(ticket);
            }
        }
        sc.close();
    }
}