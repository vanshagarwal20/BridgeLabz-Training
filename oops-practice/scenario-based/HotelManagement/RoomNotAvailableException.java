package scenario_based.HotelManagement;

class RoomNotAvailableException extends Exception {
    public RoomNotAvailableException(String msg) {
        super(msg);
    }
}
