package scenario_based.restaurant_table_reservation_system;

import java.util.*;

class Restaurant {
    Map<Integer, Table> tables = new HashMap<>();
    List<Reservation> reservations = new ArrayList<>();

    Restaurant(int numberOfTables) {
        for (int i = 1; i <= numberOfTables; i++) {
            tables.put(i, new Table(i));
        }
    }

    void reserveTable(int tableNumber, String customer, String timeSlot)
            throws TableAlreadyReservedException {

        Table table = tables.get(tableNumber);
        if (table.isReserved) {
            throw new TableAlreadyReservedException("Table " + tableNumber + " is already reserved.");
        }

        table.isReserved = true;
        reservations.add(new Reservation(tableNumber, customer, timeSlot));
        System.out.println("Table " + tableNumber + " reserved for " + customer);
    }

    void cancelReservation(int tableNumber) {
        tables.get(tableNumber).isReserved = false;
        reservations.removeIf(r -> r.tableNumber == tableNumber);
        System.out.println("Reservation cancelled for table " + tableNumber);
    }

    void showAvailableTables() {
        System.out.println("Available Tables:");
        for (Table t : tables.values()) {
            if (!t.isReserved) {
                System.out.println("Table " + t.tableNumber);
            }
        }
    }
}
