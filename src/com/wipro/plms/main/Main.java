package com.wipro.plms.main;
import java.util.ArrayList;
import com.wipro.plms.entity.*;
import com.wipro.plms.service.ParkingService;
import com.wipro.plms.util.*;
public class Main {
 public static void main(String[] args) {
 ArrayList<ParkingSlot> slots = new ArrayList<>();
 slots.add(new ParkingSlot("S1", false, null));
 slots.add(new ParkingSlot("S2", false, null));
 slots.add(new ParkingSlot("S3", false, null));
 ArrayList<ParkingTicket> tickets = new ArrayList<>();
 ParkingService service = new ParkingService(slots, tickets);
 try {
 Vehicle v1 = new Vehicle("TN10AB1234", "Car");
 ParkingTicket t1 = service.assignSlot(v1);
 System.out.println("Vehicle Parked. Ticket ID: " + t1.getTicketId());
 Thread.sleep(2000); // simulate parking duration
 double fee = service.exitVehicle(t1.getTicketId());
 System.out.println("Exit Successful. Fee: Rs." + fee);
 System.out.println("\n--- Occupied Slots ---");
 service.printOccupiedSlots();
 System.out.println("\n--- Ticket History ---");
 service.printTicketHistory();
 } catch (ParkingFullException | InvalidVehicleException |
 TicketNotFoundException | SlotOperationException ex) {
 System.out.println(ex.toString());
 } catch (Exception ex) {
 System.out.println("Unexpected Error: " + ex);
 }
 }
}