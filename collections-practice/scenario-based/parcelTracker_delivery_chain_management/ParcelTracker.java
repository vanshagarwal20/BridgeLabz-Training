package scenario_based.parcelTracker_delivery_chain_management;

class ParcelTracker {
    StageNode head;

    // Add stage at end
    void addStage(String stage) {
        StageNode newNode = new StageNode(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add custom checkpoint after a stage
    void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stage.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found. Checkpoint not added.");
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Forward tracking
    void trackParcel() {
        if (head == null) {
            System.out.println("Parcel data missing (null pointer).");
            return;
        }

        StageNode temp = head;
        System.out.println("Parcel Tracking Status:");

        while (temp != null) {
            System.out.print(temp.stage);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
