package scenario_based.ParcelTracker;

public class ParcelTrackerApp {
    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        tracker.addCheckpoint("Shipped", "Warehouse Check");
        tracker.trackParcel();
    }
}