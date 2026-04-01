package scenario_based.VehicleRental;

class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public void rentVehicle(IRentable vehicle, int days) {
        System.out.println("Rent Amount: " + vehicle.calculateRent(days));
    }
}
