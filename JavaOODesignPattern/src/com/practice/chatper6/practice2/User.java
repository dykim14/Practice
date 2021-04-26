package com.practice.chatper6.practice2;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Ticket> ticketList = new ArrayList<>();

    public boolean addTicket(Ticket ticket) {
        boolean retValue = false;
        if (ticket.getSerialNumber() > 0) {
            retValue = ticketList.add(ticket);
        }
        return retValue;
    }

    public static void main(String[] args) {
        User user = new User();
        TicketStore ticketStore = TicketStore.getInstance();
        try {
            user.addTicket(ticketStore.provideTicket());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("user buy a ticket. serial number=" + user.ticketList.get(0).getSerialNumber());
    }
}
