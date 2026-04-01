package scenario_based.restaurant_table_reservation_system;

class Table {
    int tableNumber;
    boolean isReserved;

    Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.isReserved = false;
    }
}
