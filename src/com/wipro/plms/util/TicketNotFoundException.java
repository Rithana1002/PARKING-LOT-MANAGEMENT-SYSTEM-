package com.wipro.plms.util;

public class TicketNotFoundException extends Exception {
    
    public String toString() {
        return "Parking ticket not found.";
    }
}
