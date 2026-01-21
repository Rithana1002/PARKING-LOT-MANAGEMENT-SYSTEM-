package com.wipro.plms.entity;

public class ParkingSlot {
    private String slotId;
    private boolean occupied;
    private String vehicleNumber;

    public ParkingSlot(String slotId, boolean occupied, String vehicleNumber) {
        this.slotId = slotId;
        this.occupied = occupied;
        this.vehicleNumber = vehicleNumber;
    }

    public String getSlotId() {
        return slotId;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void occupy(String vehicleNumber) {
        this.occupied = true;
        this.vehicleNumber = vehicleNumber;
    }

    public void free() {
        this.occupied = false;
        this.vehicleNumber = null;
    }
}
