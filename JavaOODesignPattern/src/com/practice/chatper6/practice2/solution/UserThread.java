package com.practice.chatper6.practice2.solution;

public class UserThread extends Thread {
    private Ticket myTicket;

    public UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        TicketManager mgr = TicketManager.getTicketManager();
        myTicket = mgr.getTicket();
    }

    public Ticket getMyTicket() {
        return myTicket;
    }
}
