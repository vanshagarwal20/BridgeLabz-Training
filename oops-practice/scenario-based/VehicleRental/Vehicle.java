package scenario_based.VehicleRental;

class Vehicle {
    protected String number;
    protected double ratePerDay;

    public Vehicle(String number, double ratePerDay) {
        this.number = number;
        this.ratePerDay = ratePerDay;
    }
}