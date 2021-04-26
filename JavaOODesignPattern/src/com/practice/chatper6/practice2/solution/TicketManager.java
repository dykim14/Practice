package com.practice.chatper6.practice2.solution;

public class TicketManager {
    private static TicketManager mgr;
    private int limits;
    private int count;

    private TicketManager() {
        count = 0;
    }

    public synchronized static TicketManager getTicketManager() {
        if (mgr == null) {
            mgr = new TicketManager();
        }
        return mgr;
    }

    public synchronized void setTicketLimits(int limits) {
        this.limits = limits;
    }

    public synchronized Ticket getTicket() {
        if (this.count < this.limits) {
            return new NormalTicket(++this.count);
        }
        return new NullTicket();
    }
}
