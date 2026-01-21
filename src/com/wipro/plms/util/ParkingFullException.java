package com.wipro.plms.util;

public class ParkingFullException extends Exception {
   
    public String toString() {
        return "Parking lot is full. No slots available.";
    }
}
