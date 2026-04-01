package scenario_based.restaurant_table_reservation_system;

class Reservation {
    int tableNumber;
    String customerName;
    String timeSlot;

    Reservation(int tableNumber, String customerName, String timeSlot) {
        this.tableNumber = tableNumber;
        this.customerName = customerName;
        this.timeSlot = timeSlot;
    }
}
