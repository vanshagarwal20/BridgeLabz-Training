package scenario_based.restaurant_table_reservation_system;

class TableAlreadyReservedException extends Exception {
    public TableAlreadyReservedException(String message) {
        super(message);
    }
}
