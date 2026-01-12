package scenario_based.HotelManagement;

public class HotelReservationApp {
    public static void main(String[] args) throws Exception {

        Room room1 = new StandardRoom(101);
        Guest guest = new Guest(1, "Vansh");

        if (!room1.isAvailable()) {
            throw new RoomNotAvailableException("Room not available");
        }

        room1.book();
        Reservation reservation =
                new Reservation(room1, guest, 3, new SeasonalPricing());

        reservation.displayDetails();

        room1.checkout();
        System.out.println("Checked out successfully");
    }
}
