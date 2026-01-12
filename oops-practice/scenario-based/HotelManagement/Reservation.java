package scenario_based.HotelManagement;

class Reservation {
    private Room room;
    private Guest guest;
    private int days;
    private PricingStrategy pricingStrategy;

    public Reservation(Room room, Guest guest, int days, PricingStrategy pricingStrategy) {
        this.room = room;
        this.guest = guest;
        this.days = days;
        this.pricingStrategy = pricingStrategy;
    }

    public double generateInvoice() {
        return pricingStrategy.calculatePrice(room.basePrice, days);
    }

    public void displayDetails() {
        System.out.println("Guest: " + guest.getName());
        System.out.println("Room: " + room.getRoomType());
        System.out.println("Total Bill: ₹" + generateInvoice());
    }
}
