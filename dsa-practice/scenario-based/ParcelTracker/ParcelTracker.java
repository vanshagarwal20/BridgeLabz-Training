package scenario_based.ParcelTracker;

class ParcelTracker {
    private StageNode head;

//     Add stage at end
    public void addStage(String stage) {
        StageNode newNode = new StageNode(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

//     Add intermediate checkpoint after given stage
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stage.equals(afterStage))
            temp = temp.next;

        if (temp == null) {
            System.out.println("Stage not found. Parcel may be lost!");
            return;
        }

        StageNode node = new StageNode(newStage);
        node.next = temp.next;
        temp.next = node;
    }

//     Track parcel forward
    public void trackParcel() {
        if (head == null) {
            System.out.println("No tracking info available!");
            return;
        }

        StageNode temp = head;
        System.out.print("Parcel Status: ");
        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}