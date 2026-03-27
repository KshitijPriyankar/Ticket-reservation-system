package com.ticket.service;

import com.ticket.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationServiceTest {
   
    @Test
    void testBookingSuccess() {
        ReservationService service = new ReservationService();
        Passenger p = new Passenger(1, "Kshitij", 22);
        Ticket ticket = service.bookTicket(p, 12591);
        assertNotNull(ticket);
        assertEquals("BOOKED", ticket.getStatus());
    }

    @Test
    void testCancelTicket() {
        ReservationService service = new ReservationService();
        Passenger p = new Passenger(2, "Test", 25);
        Ticket ticket = service.bookTicket(p, 12591);
        service.cancelTicket(ticket);
        assertEquals("CANCELLED", ticket.getStatus());
    }

    @Test
    void testInvalidTrain() {
        ReservationService service = new ReservationService();
        Passenger p = new Passenger(3, "Test", 30);
        Ticket ticket = service.bookTicket(p, 99999);
        assertNull(ticket);
    }
}