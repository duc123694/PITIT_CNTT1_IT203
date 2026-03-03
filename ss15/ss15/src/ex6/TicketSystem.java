package ex6;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
    private Queue<Ticket> ticketQueue = new LinkedList<>();
    private int currentNumber = 0;
    public void issueTicket(String time) {
        currentNumber++;
        ticketQueue.offer(new Ticket(currentNumber, time));
    }
    public Ticket callNext() {
        if (ticketQueue.isEmpty()) return null;
        return ticketQueue.poll();
    }
}