package scenario_based.HotelManagement;

abstract class Room {
    protected int roomNumber;
    protected double basePrice;
    protected boolean isAvailable = true;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void book() {
        isAvailable = false;
    }

    public void checkout() {
        isAvailable = true;
    }

    public abstract String getRoomType();
}

