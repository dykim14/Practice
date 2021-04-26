package com.practice.chatper6.practice2;

public class TicketStore {
    private static final TicketStore instance = new TicketStore();
    private static final int TICKET_TOTAL_COUNT = 1000;
    private int serialNumber = 100000;
    private int totalCount = 0;

    private TicketStore() {}

    public static TicketStore getInstance() {
        return instance;
    }

    public Ticket provideTicket() throws Exception {
        if (totalCount >= TICKET_TOTAL_COUNT) {
            throw new Exception("Ticket is sold-out");
        }
        totalCount++;
        return new Ticket(serialNumber++);
    }
}
