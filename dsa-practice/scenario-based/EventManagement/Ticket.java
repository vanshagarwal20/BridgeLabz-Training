package scenario_based.EventManagement;

class Ticket {
    String eventName;
    double price;

    public Ticket(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
    }

    public String toString() {
        return eventName + " : ₹" + price;
    }
}
