package scenario_based.VehicleRental;

class Bike extends Vehicle implements IRentable {
    public Bike(String number, double rate) {
        super(number, rate);
    }

    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}
