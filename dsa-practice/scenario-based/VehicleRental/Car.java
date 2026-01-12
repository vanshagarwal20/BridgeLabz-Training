package scenario_based.VehicleRental;

class Car extends Vehicle implements IRentable {
    public Car(String number, double rate) {
        super(number, rate);
    }

    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}
