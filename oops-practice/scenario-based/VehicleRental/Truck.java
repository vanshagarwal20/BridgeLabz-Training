package scenario_based.VehicleRental;

class Truck extends Vehicle implements IRentable {
    public Truck(String number, double rate) {
        super(number, rate);
    }

    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}
