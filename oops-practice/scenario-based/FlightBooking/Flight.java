package scenario_based.FlightBooking;

class Flight {
    String flightCode;
    String source;
    String destination;

    public Flight(String flightCode, String source, String destination) {
        this.flightCode = flightCode;
        this.source = source;
        this.destination = destination;
    }
}