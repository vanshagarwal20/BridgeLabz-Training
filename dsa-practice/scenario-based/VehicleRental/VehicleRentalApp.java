package scenario_based.VehicleRental;

public class VehicleRentalApp {
    public static void main(String[] args) {
        Customer c = new Customer("Vansh");

        IRentable bike = new Bike("BK101", 300);
        IRentable car = new Car("CR202", 1200);

        c.rentVehicle(bike, 2);
        c.rentVehicle(car, 3);
    }
}
