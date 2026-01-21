package com.wipro.plms.service;

import java.util.ArrayList;
import com.wipro.plms.entity.*;
import com.wipro.plms.util.*;

public class ParkingService {

    ArrayList<ParkingSlot> slots;
    ArrayList<ParkingTicket> tickets;
    int ticket = 1;

    public ParkingService(ArrayList<ParkingSlot> slots,
                          ArrayList<ParkingTicket> tickets) {
        this.slots = slots;
        this.tickets = tickets;
    }

    public ParkingTicket assignSlot(Vehicle vehicle)
            throws ParkingFullException, InvalidVehicleException {

        for (int i = 0; i < slots.size(); i++) {

            if (slots.get(i).isOccupied() == false) {

                slots.get(i).occupy(vehicle.getVehicleNumber());

                ParkingTicket t =
                        new ParkingTicket("T" + ticket,
                                vehicle.getVehicleNumber(),
                                slots.get(i).getSlotId(),
                                System.currentTimeMillis());

                ticket++;
                tickets.add(t);
                return t;
            }
        }

        throw new ParkingFullException();
    }

   
    public double exitVehicle(String ticketId)
            throws TicketNotFoundException, SlotOperationException {

        for (int i = 0; i < tickets.size(); i++) {

            if (tickets.get(i).getTicketId().equals(ticketId)) {

                for (int j = 0; j < slots.size(); j++) {

                    if (slots.get(j).getSlotId()
                            .equals(tickets.get(i).getSlotId())) {

                        slots.get(j).free();
                        tickets.get(i).setTotalFee(20);
                        return 20;
                    }
                }
            }
        }

        throw new TicketNotFoundException();
    }

    public void printOccupiedSlots() {

        for (int i = 0; i < slots.size(); i++) {
            if (slots.get(i).isOccupied()) {
                System.out.println(slots.get(i).getSlotId());
            }
        }
    }

   
    public void printTicketHistory() {

        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(tickets.get(i));
        }
    }
}
