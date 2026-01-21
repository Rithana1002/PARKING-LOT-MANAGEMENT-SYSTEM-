package com.wipro.plms.entity;

public class ParkingTicket {
    private String ticketId;
    private String vehicleNumber;
    private String slotId;
    private long entryTime;
    private long exitTime;
    private double totalFee;

    public ParkingTicket(String ticketId, String vehicleNumber, String slotId, long entryTime) {
        this.ticketId = ticketId;
        this.vehicleNumber = vehicleNumber;
        this.slotId = slotId;
        this.entryTime = entryTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getSlotId() {
        return slotId;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    
    public String toString() {
        return "TicketID=" + ticketId +
               ", Vehicle=" + vehicleNumber +
               ", Slot=" + slotId +
               ", Entry=" + entryTime +
               ", Exit=" + exitTime +
               ", Fee=" + totalFee;
    }
}
