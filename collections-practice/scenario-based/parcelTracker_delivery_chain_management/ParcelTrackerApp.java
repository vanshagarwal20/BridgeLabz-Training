package scenario_based.parcelTracker_delivery_chain_management;

public class ParcelTrackerApp {
    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        // Default stages
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        // Add custom checkpoint
        tracker.addCheckpoint("Shipped", "Warehouse Check");

        // Track parcel
        tracker.trackParcel();
    }
}

