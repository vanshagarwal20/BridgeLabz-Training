package scenario_based.EventManagement;

import java.util.*;

class EventManager {
    private List<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket t) {
        tickets.add(t);
    }

    public void sortTicketsByPrice() {
        quickSort(0, tickets.size() - 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        double pivot = tickets.get(high).price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets.get(j).price <= pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Ticket temp = tickets.get(i);
        tickets.set(i, tickets.get(j));
        tickets.set(j, temp);
    }

    public void displayTopTickets(int n, boolean cheapest) {
        if (cheapest) {
            System.out.println("Top " + n + " Cheapest Tickets:");
            for (int i = 0; i < Math.min(n, tickets.size()); i++)
                System.out.println(tickets.get(i));
        } else {
            System.out.println("Top " + n + " Expensive Tickets:");
            for (int i = tickets.size() - 1; i >= Math.max(tickets.size() - n, 0); i--)
                System.out.println(tickets.get(i));
        }
    }
}