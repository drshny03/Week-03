package com.tit.day01.linkedlist.circularlinkedlist.reservation;

public class TicketReservationMain {


    private Ticket head = null;
    private Ticket tail = null;

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        System.out.println("Ticket added successfully!");
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket temp = head, prev = null;

        // Handle case where the ticket to remove is the head
        do {
            if (temp.ticketId == ticketId) {
                if (temp == head) {
                    if (head == tail) {
                        head = tail = null; // Single node case
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Ticket removed successfully!");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets to display.");
            return;
        }

        System.out.println("Current Tickets:");
        Ticket temp = head;
        do {
            System.out.println("[Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                    ", Time: " + temp.bookingTime + "]");
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        boolean found = false;
        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("[Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                        ", Time: " + temp.bookingTime + "]");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for the given keyword.");
        }
    }

    // Calculate the total number of booked tickets
    public int totalTickets() {
        if (head == null) return 0;

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    public static void main(String[] args) {
        TicketReservationMain system = new TicketReservationMain();

        // Adding tickets
        system.addTicket(101, "Darshan", "Avengers: Endgame", "A1", "10:00 AM");
        system.addTicket(102, "Rajveer", "Avengers: Endgame", "A2", "10:00 AM");
        system.addTicket(103, "Aadi", "BatMan", "B3", "12:00 PM");

        // Display tickets
        system.displayTickets();

        // Search for a ticket
        System.out.println("\nSearching for tickets with keyword 'Avengers: Endgame':");
        system.searchTicket("Avengers: Endgame");

        // Remove a ticket
        System.out.println("\nRemoving ticket with ID 102:");
        system.removeTicket(102);

        // Display tickets again
        system.displayTickets();

        // Calculate total tickets
        System.out.println("\nTotal tickets booked: " + system.totalTickets());
    }
}
