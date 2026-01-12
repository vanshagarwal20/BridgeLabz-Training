package scenario_based.TrafficManagement;

public class TrafficManagerApp {
    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager(3);

        tm.enqueueVehicle("CAR-101");
        tm.enqueueVehicle("CAR-102");
        tm.enqueueVehicle("CAR-103");
        tm.enqueueVehicle("CAR-104"); // overflow

        tm.allowEntry();
        tm.allowEntry();

        tm.showRoundabout();

        tm.exitVehicle();
        tm.showRoundabout();

        tm.allowEntry();
        tm.showRoundabout();
    }
}
