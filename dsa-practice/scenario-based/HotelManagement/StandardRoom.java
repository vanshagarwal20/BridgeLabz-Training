package scenario_based.HotelManagement;

class StandardRoom extends Room {
    public StandardRoom(int roomNumber) {
        super(roomNumber, 2000);
    }

    public String getRoomType() {
        return "Standard Room";
    }
}
