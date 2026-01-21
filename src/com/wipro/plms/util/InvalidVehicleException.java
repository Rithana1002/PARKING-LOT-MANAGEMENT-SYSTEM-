package com.wipro.plms.util;

public class InvalidVehicleException extends Exception {
  
    public String toString() {
        return "Invalid or duplicate vehicle detected.";
    }
}
