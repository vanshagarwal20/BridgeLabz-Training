package scenario_based.restaurant_table_reservation_system;

public class RestaurantReservationSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(5);

        try {
            restaurant.reserveTable(1, "Vansh", "7-8 PM");
            restaurant.reserveTable(1, "Aman", "8-9 PM");
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        restaurant.showAvailableTables();
        restaurant.cancelReservation(1);
        restaurant.showAvailableTables();
    }
}
