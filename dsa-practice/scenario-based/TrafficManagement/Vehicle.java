package scenario_based.TrafficManagement;

class Vehicle {
    String number;
    Vehicle next;

    Vehicle(String number) {
        this.number = number;
        this.next = null;
    }
}
