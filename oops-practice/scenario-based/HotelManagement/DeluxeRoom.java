package scenario_based.HotelManagement;

class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber) {
        super(roomNumber, 3500);
    }

    public String getRoomType() {
        return "Deluxe Room";
    }
}
